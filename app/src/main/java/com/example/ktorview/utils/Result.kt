package com.example.ktorview.utils

sealed class Result<T>{
    class Success<T>(val data: T) : Result<T>()

    data class Loading<T>(
        val progressState: ProgressState = ProgressState.Idle
    ) : Result<T>()

    class ApiError<T>(val message: String) : Result<T>()

    class NetworkError<T>(val throwable: Throwable) : Result<T>()

    class NullResult<T> : Result<T>()
}


sealed class ProgressState {

    object Progress : ProgressState()

    object Idle : ProgressState()
}
