package com.example.domain.base

import io.reactivex.Scheduler

class UseCaseException(val execution: Scheduler, val postExecution: Scheduler)