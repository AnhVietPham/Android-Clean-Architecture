package com.example.anhvietpham.base.viewbase.viewcontroller

import android.os.Bundle
import android.view.View
import com.bluelinelabs.conductor.Controller
import com.example.anhvietpham.base.viewbase.lifecycleevent.ControllerLogLifecycleListener
import org.koin.standalone.KoinComponent

abstract class ViewController(bundle: Bundle?) : Controller(bundle) {
    init {
        addLifecycleListener(ControllerLogLifecycleListener(this.javaClass.simpleName))
        addLifecycleListener(object : LifecycleListener() {
            override fun postCreateView(controller: Controller, view: View) {
                super.postCreateView(controller, view)
                initPostCreateView(view)
            }
        })
    }

    abstract fun initPostCreateView(view: View)
}