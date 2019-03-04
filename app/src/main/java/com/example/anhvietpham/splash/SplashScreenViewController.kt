package com.example.anhvietpham.splash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.anhvietpham.base.viewbase.viewcontroller.ViewController
import com.example.anhvietpham.basic_clean_architecture.R

class SplashScreenViewController(bundle: Bundle?) : ViewController(bundle) {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        return inflater.inflate(R.layout.screen_splash, container, false)
    }

    override fun initPostCreateView(view: View) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}