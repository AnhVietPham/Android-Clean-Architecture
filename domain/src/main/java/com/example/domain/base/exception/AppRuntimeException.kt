package com.example.domain.base.exception

import java.lang.RuntimeException

class AppRuntimeException(
    message: String = "",
    cause: Throwable = Throwable()
) : RuntimeException(message, cause)