package com.example.presentation.features.splash

import com.example.presentation.base.PresenterMvp
import com.example.presentation.base.ViewMvp

interface SplashContract{
    interface View : ViewMvp{
        fun gotoHomeScreen()
        fun gotoLoginScreen()
    }

    abstract class Presenter : PresenterMvp<View>()
}