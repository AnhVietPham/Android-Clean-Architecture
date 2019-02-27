package com.example.presentation.base

import java.lang.ref.WeakReference

class PresenterMvp<V : ViewMvp> {
    private var weakReference : WeakReference<V>? = null
}