package br.com.zup.infrastructure.service

import br.com.zup.core.port.ToyInfrastructurePort
import br.com.zup.infrastructure.broker.ToyClientNats
import br.com.zup.infrastructure.model.ToyEvent
import javax.inject.Singleton

@Singleton
class ToyServiceImpl(private val toyClientNats: ToyClientNats): ToyInfrastructurePort {
    override fun sendToy(toyEvent: ToyEvent) = toyClientNats.sendToy(toyEvent)
}