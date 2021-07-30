package br.com.zup.infrastructure.model

import br.com.zup.entrypoint.dto.ToyDto
import br.com.zup.infrastructure.enum.TakeAction

data class ToyEvent(
    val toy: ToyDto,
    val takeAction: TakeAction
){}
