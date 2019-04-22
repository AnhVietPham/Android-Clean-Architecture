package com.example.domain.base.exception


class AppException(
    message: String = "",
    cause: Throwable = Throwable(),
    errorCode: Int = 0
) : Exception(message, cause)