package com.example.domain.base

import io.reactivex.disposables.Disposable

class UseCaseTask(var disposable: Disposable) {
    fun cancel() {
        disposable.dispose()
    }
}