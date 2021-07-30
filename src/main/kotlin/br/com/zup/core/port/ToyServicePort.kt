package br.com.zup.core.port

import br.com.zup.core.model.Toy
import java.util.*

interface ToyServicePort {
    fun create(toy: Toy)
    fun update(id: UUID, toy: Toy)
    fun delete(id: UUID)
}
