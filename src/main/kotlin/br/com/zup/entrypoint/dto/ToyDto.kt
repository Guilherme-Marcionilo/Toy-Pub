package br.com.zup.entrypoint.dto

import io.micronaut.core.annotation.Introspected
import java.math.BigDecimal
import java.util.*
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Positive

@Introspected
data class ToyDto(
    var id: UUID?,
    @field:NotBlank var name: String,
    @field:Positive val price: BigDecimal,
    @field:NotBlank val description: String
)
