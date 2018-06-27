package com.example.soohwan.daggertutorial.ui

import android.os.Bundle
import com.example.soohwan.daggertutorial.R
import com.example.soohwan.daggertutorial.databinding.MainActivityBinding
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {
    val TAG = MainActivity::class.java.simpleName

    @Inject
    lateinit var binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment())
                .commitNow()

    }
}
