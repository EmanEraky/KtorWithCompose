package com.example.ktorview.di

import com.example.ktorview.data.ApiService
import com.example.ktorview.data.ApiServiceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.android.*
import io.ktor.client.features.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.http.*
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class ApplicationModule {




    @Provides
    @Singleton
    fun provideApiHelper(apiService: ApiServiceImpl): ApiService = apiService

    @Provides
    @Singleton
    fun provideBuild(): HttpClient {
        return HttpClient(Android) {
            install(JsonFeature){
                serializer = KotlinxSerializer(
                    kotlinx.serialization.json.Json {
                        ignoreUnknownKeys = true // if the server sends extra fields, ignore them
                    }
                )
                acceptContentTypes= acceptContentTypes + listOf(
                    ContentType.parse("*/*")
                )

                HttpResponseValidator {
                    validateResponse { response ->
                        val error = response.receive<Error>()
                        val statusCode=response.status.value
                        if (statusCode != 200) {
                            throw Exception(error.message)
                        }
                    }
                }
            }

        }

    }

}