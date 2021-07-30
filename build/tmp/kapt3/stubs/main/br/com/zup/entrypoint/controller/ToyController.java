package br.com.zup.entrypoint.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J6\u0010\u0005\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00062\b\b\u0001\u0010\t\u001a\u00020\nH\u0017J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0017J\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\t\u001a\u00020\nH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lbr/com/zup/entrypoint/controller/ToyController;", "", "toyServicePort", "Lbr/com/zup/core/port/ToyServicePort;", "(Lbr/com/zup/core/port/ToyServicePort;)V", "create", "Lio/micronaut/http/MutableHttpResponse;", "", "kotlin.jvm.PlatformType", "dto", "Lbr/com/zup/entrypoint/dto/ToyDto;", "delete", "Lio/micronaut/http/HttpResponse;", "id", "Ljava/util/UUID;", "update", "toyPub"})
@io.micronaut.http.annotation.Controller(value = "/toy")
@io.micronaut.validation.Validated()
public class ToyController {
    private final br.com.zup.core.port.ToyServicePort toyServicePort = null;
    
    @io.micronaut.http.annotation.Post()
    public io.micronaut.http.MutableHttpResponse<kotlin.Unit> create(@org.jetbrains.annotations.NotNull()
    @javax.validation.Valid()
    @io.micronaut.http.annotation.Body()
    br.com.zup.entrypoint.dto.ToyDto dto) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Put(value = "/{id}")
    public io.micronaut.http.HttpResponse<kotlin.Unit> update(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.PathVariable()
    java.util.UUID id, @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Body()
    @javax.validation.Valid()
    br.com.zup.entrypoint.dto.ToyDto dto) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Delete(value = "/{id}")
    public io.micronaut.http.HttpResponse<kotlin.Unit> delete(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.PathVariable()
    java.util.UUID id) {
        return null;
    }
    
    public ToyController(@org.jetbrains.annotations.NotNull()
    br.com.zup.core.port.ToyServicePort toyServicePort) {
        super();
    }
}