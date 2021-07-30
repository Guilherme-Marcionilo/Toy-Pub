package br.com.zup.core.service

import br.com.zup.core.mapper.ToyConverter
import br.com.zup.core.model.Toy
import br.com.zup.core.port.ToyInfrastructurePort
import br.com.zup.core.port.ToyServicePort
import br.com.zup.entrypoint.dto.ToyDto
import br.com.zup.infrastructure.enum.TakeAction.*
import br.com.zup.infrastructure.model.ToyEvent
import java.math.BigDecimal
import java.util.*
import javax.inject.Singleton

@Singleton
class ToyServiceImpl(private val toyInfrastructure: ToyInfrastructurePort): ToyServicePort {

    override fun create(toy: Toy) = toyInfrastructure.sendToy(ToyConverter.toyToToyEvent(toy, REGISTER))

    override fun update(id: UUID, toy: Toy) {
        val toyEvent = ToyConverter.toyToToyEvent(toy,UPDATE)
        toyEvent.toy.id = id
        toyInfrastructure.sendToy(toyEvent)
    }

    override fun delete(id: UUID) {
        val toyEvent = ToyEvent(ToyDto(id, "?", BigDecimal.ONE, "?"), DELETE)
        toyInfrastructure.sendToy(toyEvent)
    }


}