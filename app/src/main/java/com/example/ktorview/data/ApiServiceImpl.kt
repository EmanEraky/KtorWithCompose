package com.example.ktorview.data

import com.example.ktorview.domain.models.ResponseModel
import com.example.ktorview.utils.ProgressState
import com.example.ktorview.utils.Result
import io.ktor.client.*
import io.ktor.client.features.*
import io.ktor.client.request.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class ApiServiceImpl @Inject constructor(private val client: HttpClient) : ApiService {

    override suspend fun getProducts(): Flow<Result<List<ResponseModel>>> {
        return flow {
            emit(Result.Loading(progressState = ProgressState.Progress))
            try {
                emit(Result.Success(data = client.get(ApiRoutes.PRODUCTS)))
            } catch (e: Exception) {
                emit(Result.ApiError( e.message ?: "Unknown Error"))
            } finally {
                emit(Result.Loading(progressState = ProgressState.Idle))
            }
        }

    }

    override suspend fun createProducts(productRequest: ResponseModel): ResponseModel? {
        return try {
            client.post<ResponseModel> {
                url(ApiRoutes.PRODUCTS)
                body = productRequest

            }

        } catch (ex: ServerResponseException) {
            println("Error: ${ex.response.status.description}")
            null
        }
    }
}