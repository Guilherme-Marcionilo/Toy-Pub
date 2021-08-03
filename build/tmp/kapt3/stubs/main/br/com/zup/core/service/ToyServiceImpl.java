package br.com.zup.core.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lbr/com/zup/core/service/ToyServiceImpl;", "Lbr/com/zup/core/port/ToyServicePort;", "toyInfrastructure", "Lbr/com/zup/core/port/ToyInfrastructurePort;", "(Lbr/com/zup/core/port/ToyInfrastructurePort;)V", "LOG", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "create", "", "toy", "Lbr/com/zup/core/model/Toy;", "delete", "id", "Ljava/util/UUID;", "update", "toyPub"})
@javax.inject.Singleton()
public final class ToyServiceImpl implements br.com.zup.core.port.ToyServicePort {
    private final org.slf4j.Logger LOG = null;
    private final br.com.zup.core.port.ToyInfrastructurePort toyInfrastructure = null;
    
    @java.lang.Override()
    public void create(@org.jetbrains.annotations.NotNull()
    br.com.zup.core.model.Toy toy) {
    }
    
    @java.lang.Override()
    public void update(@org.jetbrains.annotations.NotNull()
    java.util.UUID id, @org.jetbrains.annotations.NotNull()
    br.com.zup.core.model.Toy toy) {
    }
    
    @java.lang.Override()
    public void delete(@org.jetbrains.annotations.NotNull()
    java.util.UUID id) {
    }
    
    public ToyServiceImpl(@org.jetbrains.annotations.NotNull()
    br.com.zup.core.port.ToyInfrastructurePort toyInfrastructure) {
        super();
    }
}