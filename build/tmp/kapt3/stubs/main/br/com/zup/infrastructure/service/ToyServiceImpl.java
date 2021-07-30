package br.com.zup.infrastructure.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lbr/com/zup/infrastructure/service/ToyServiceImpl;", "Lbr/com/zup/core/port/ToyInfrastructurePort;", "toyClientNats", "Lbr/com/zup/infrastructure/broker/ToyClientNats;", "(Lbr/com/zup/infrastructure/broker/ToyClientNats;)V", "sendToy", "", "toyEvent", "Lbr/com/zup/infrastructure/model/ToyEvent;", "toyPub"})
@javax.inject.Singleton()
public final class ToyServiceImpl implements br.com.zup.core.port.ToyInfrastructurePort {
    private final br.com.zup.infrastructure.broker.ToyClientNats toyClientNats = null;
    
    @java.lang.Override()
    public void sendToy(@org.jetbrains.annotations.NotNull()
    br.com.zup.infrastructure.model.ToyEvent toyEvent) {
    }
    
    public ToyServiceImpl(@org.jetbrains.annotations.NotNull()
    br.com.zup.infrastructure.broker.ToyClientNats toyClientNats) {
        super();
    }
}