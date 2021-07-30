package br.com.zup.infrastructure.broker

import br.com.zup.infrastructure.model.ToyEvent
import io.micronaut.nats.annotation.NatsClient
import io.micronaut.nats.annotation.Subject

@NatsClient
interface ToyClientNats {

    @Subject("channel.toy")
    fun sendToy(lancheEvent: ToyEvent)
}