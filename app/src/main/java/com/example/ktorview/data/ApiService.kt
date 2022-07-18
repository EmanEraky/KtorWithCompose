package com.example.ktorview.data

import com.example.ktorview.domain.models.ResponseModel
import com.example.ktorview.utils.Result
import io.ktor.client.*
import io.ktor.client.engine.android.*
import io.ktor.client.features.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*
import io.ktor.http.*
import kotlinx.coroutines.flow.Flow

interface ApiService {
    suspend fun getProducts(): Flow<Result<List<ResponseModel>>>

    suspend fun createProducts(productRequest: ResponseModel): ResponseModel?

   /* companion object {
        fun create(): ApiService {
            return ApiServiceImpl(
                client = HttpClient(Android) {
                    // JSON
                    install(JsonFeature) {
                        serializer = KotlinxSerializer(json)
                        //or serializer = KotlinxSerializer()
                    }

                    // Apply to all requests
                    defaultRequest {
                        // Parameter("api_key", "some_api_key")
                        // Content Type
                        if (method != HttpMethod.Get) contentType(ContentType.Application.Json)
                        accept(ContentType.Application.Json)
                    }
                }
            )
        }

        private val json = kotlinx.serialization.json.Json {
            ignoreUnknownKeys = true
            isLenient = true
            encodeDefaults = false
        }
    }*/
}