package br.com.zup

import br.com.zup.core.model.Toy
import br.com.zup.core.port.ToyServicePort
import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe
import io.micronaut.test.extensions.kotest.annotation.MicronautTest
import io.mockk.every
import io.mockk.mockk
import java.math.BigDecimal
import java.util.*

@MicronautTest
class ToyServicePortTest : AnnotationSpec() {

    private val toyServicePort = mockk<ToyServicePort>()

    private lateinit var toy: Toy
    private var id = UUID.randomUUID()

    @BeforeEach
    fun setUp() {
        toy = Toy("Test", BigDecimal.ONE, "test description")
    }

    @Test
    fun `should Unit - CREATE`() {
        every { toyServicePort.create(any()) } answers { toy }
        val result = toyServicePort.create(toy)
        result shouldBe Unit
    }

    @Test
    fun `should Unit - UPDATE`() {

        every { toyServicePort.update(id,any()) } answers { toy }
        val result = toyServicePort.update(id,toy)
        result shouldBe Unit
    }

    @Test
    fun `should Unit - DELETE`() {
        every { toyServicePort.delete(any()) } answers { toy }
        val result = toyServicePort.delete(id)
        result shouldBe Unit
    }
}