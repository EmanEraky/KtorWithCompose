package com.example.ktorview.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/example/ktorview/di/ApplicationModule;", "", "()V", "provideApiHelper", "Lcom/example/ktorview/data/ApiService;", "apiService", "Lcom/example/ktorview/data/ApiServiceImpl;", "provideBuild", "Lio/ktor/client/HttpClient;", "app_debug"})
@dagger.Module()
public final class ApplicationModule {
    
    public ApplicationModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.ktorview.data.ApiService provideApiHelper(@org.jetbrains.annotations.NotNull()
    com.example.ktorview.data.ApiServiceImpl apiService) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final io.ktor.client.HttpClient provideBuild() {
        return null;
    }
}