package com.example.ktorview.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J#\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t0\b0\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/example/ktorview/data/ApiService;", "", "createProducts", "Lcom/example/ktorview/domain/models/ResponseModel;", "productRequest", "(Lcom/example/ktorview/domain/models/ResponseModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProducts", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/ktorview/utils/Result;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getProducts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.ktorview.utils.Result<java.util.List<com.example.ktorview.domain.models.ResponseModel>>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object createProducts(@org.jetbrains.annotations.NotNull()
    com.example.ktorview.domain.models.ResponseModel productRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.ktorview.domain.models.ResponseModel> continuation);
}