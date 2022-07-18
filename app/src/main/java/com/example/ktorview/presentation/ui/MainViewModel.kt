package com.example.ktorview.presentation.ui

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ktorview.domain.useCase.ProductsUseCase
import com.example.ktorview.utils.ProgressState
import com.example.ktorview.utils.Result
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val getProductsUseCase: ProductsUseCase) :
    ViewModel() {

    val _state: MutableState<ProductState> = mutableStateOf(ProductState())


    init {
        getProducts()
    }

    private fun getProducts() {
        viewModelScope.launch {
            getProductsUseCase.executeProduct().collect { resource ->
                when (resource) {
                    is Result.Loading -> {
                        when (resource.progressState) {
                            is ProgressState.Progress -> {
                                _state.value = _state.value.copy(isLoading = true)
                            }
                            is ProgressState.Idle -> {
                                _state.value = _state.value.copy(isLoading = false)
                            }
                        }
                    }
                    is Result.Success -> {
                        _state.value = _state.value.copy(products = resource.data ?: listOf())
                    }

                    is Result.ApiError -> {
                        _state.value = _state.value.copy(
                            errorMessage = resource.message ?: "Unknown Error"
                        )
                    }
                }

            }


        }

    }
}