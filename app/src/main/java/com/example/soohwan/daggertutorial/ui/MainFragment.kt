package com.example.soohwan.daggertutorial.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.soohwan.daggertutorial.databinding.MainFragmentBinding
import com.example.soohwan.daggertutorial.di.Named
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class MainFragment @Inject constructor() : DaggerFragment() {
    @Inject
    lateinit var binding: MainFragmentBinding

    @Inject
    @field:Named("hello")
    lateinit var txtHelloWorld: String

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textView.text = txtHelloWorld
    }
}
