package com.example.ktorview.domain.useCase

import com.example.ktorview.data.ApiService
import javax.inject.Inject

class ProductsUseCase @Inject constructor(private val unsplashRepository: ApiService) {
    suspend fun executeProduct() = unsplashRepository.getProducts()
}