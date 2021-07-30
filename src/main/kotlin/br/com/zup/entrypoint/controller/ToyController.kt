package br.com.zup.entrypoint.controller

import br.com.zup.core.mapper.ToyConverter
import br.com.zup.core.port.ToyServicePort
import br.com.zup.entrypoint.dto.ToyDto
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Delete
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Put
import io.micronaut.validation.Validated
import java.util.*
import javax.validation.Valid

@Validated
@Controller("/toy")
class ToyController(private val toyServicePort: ToyServicePort) {

    @Post
    fun create(@Body @Valid dto: ToyDto) = HttpResponse.created(toyServicePort.create(ToyConverter.toToy(dto)))

    @Put("/{id}")
    fun update(@PathVariable id: UUID, @Valid @Body dto: ToyDto): HttpResponse<Unit> {
        toyServicePort.update(id, ToyConverter.toToy(dto))
        return HttpResponse.noContent()
    }

    @Delete("/{id}")
    fun delete(@PathVariable id: UUID): HttpResponse<Unit> {
        toyServicePort.delete(id)
        return HttpResponse.noContent()
    }


}