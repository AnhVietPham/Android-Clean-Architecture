package com.example.domain.base

import io.reactivex.Scheduler

class UseCaseExecution(val execution: Scheduler, val postExecution: Scheduler)