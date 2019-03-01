package com.example.domain.base

interface RawResultListener<in SuccessOutput> {
    fun success(successOutput: SuccessOutput)
    fun fail(throwable: Throwable)
}