package com.example.domain.base

abstract class UseCase<in Input, SuccessOutput, FailOutput> internal constructor(private val useCaseExecution: UseCaseException){
}