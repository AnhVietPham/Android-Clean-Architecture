package com.example.domain.base.exception

import java.lang.Exception

class AppException(message: String, cause: Throwable?) : Exception(message,cause){
    var errorCode : Int = 0

    constructor(message: String) : this(message,null)

    constructor(message: String, errorCode: Int) : this(message){
        this.errorCode = errorCode
    }
}