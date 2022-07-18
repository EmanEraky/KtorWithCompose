package com.example.ktorview.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ#\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\f0\u000b0\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/example/ktorview/data/ApiServiceImpl;", "Lcom/example/ktorview/data/ApiService;", "client", "Lio/ktor/client/HttpClient;", "(Lio/ktor/client/HttpClient;)V", "createProducts", "Lcom/example/ktorview/domain/models/ResponseModel;", "productRequest", "(Lcom/example/ktorview/domain/models/ResponseModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProducts", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/ktorview/utils/Result;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ApiServiceImpl implements com.example.ktorview.data.ApiService {
    private final io.ktor.client.HttpClient client = null;
    
    @javax.inject.Inject()
    public ApiServiceImpl(@org.jetbrains.annotations.NotNull()
    io.ktor.client.HttpClient client) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getProducts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.ktorview.utils.Result<java.util.List<com.example.ktorview.domain.models.ResponseModel>>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object createProducts(@org.jetbrains.annotations.NotNull()
    com.example.ktorview.domain.models.ResponseModel productRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.ktorview.domain.models.ResponseModel> continuation) {
        return null;
    }
}