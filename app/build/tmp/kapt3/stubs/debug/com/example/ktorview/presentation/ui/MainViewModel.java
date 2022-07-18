package com.example.ktorview.presentation.ui;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0002R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/ktorview/presentation/ui/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "getProductsUseCase", "Lcom/example/ktorview/domain/useCase/ProductsUseCase;", "(Lcom/example/ktorview/domain/useCase/ProductsUseCase;)V", "_state", "Landroidx/compose/runtime/MutableState;", "Lcom/example/ktorview/presentation/ui/ProductState;", "get_state", "()Landroidx/compose/runtime/MutableState;", "getProducts", "", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.ktorview.domain.useCase.ProductsUseCase getProductsUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<com.example.ktorview.presentation.ui.ProductState> _state = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.ktorview.domain.useCase.ProductsUseCase getProductsUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<com.example.ktorview.presentation.ui.ProductState> get_state() {
        return null;
    }
    
    private final void getProducts() {
    }
}