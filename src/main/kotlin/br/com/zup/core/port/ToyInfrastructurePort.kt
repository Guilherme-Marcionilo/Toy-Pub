package br.com.zup.core.port

import br.com.zup.infrastructure.model.ToyEvent
import javax.inject.Singleton

@Singleton
interface ToyInfrastructurePort {
    fun sendToy(toyEvent: ToyEvent)
}
