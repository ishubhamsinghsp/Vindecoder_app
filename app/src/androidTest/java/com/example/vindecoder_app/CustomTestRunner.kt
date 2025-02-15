package com.example.vindecoder_app

import android.app.Application
import android.content.Context
import android.support.test.runner.AndroidJUnitRunner
import dagger.hilt.android.testing.HiltTestApplication
import org.junit.runner.manipulation.Ordering


class CustomTestRunner: AndroidJUnitRunner()
{
    override fun newApplication(cl: ClassLoader?, name: String?, context: Context?): Application {
        return super.newApplication(cl, HiltTestApplication::class.java.name, context)

    }
}