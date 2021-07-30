package br.com.zup.core.mapper

import br.com.zup.core.model.Toy
import br.com.zup.entrypoint.dto.ToyDto
import br.com.zup.infrastructure.enum.TakeAction
import br.com.zup.infrastructure.model.ToyEvent

class ToyConverter {

    companion object {
        fun toToy(dto: ToyDto) =
            Toy(dto.name, dto.price, dto.description)

        fun toyToToyEvent(toy: Toy, takeAction: TakeAction) =
            ToyEvent(ToyDto(null, toy.name, toy.price, toy.description), takeAction)
    }

}
