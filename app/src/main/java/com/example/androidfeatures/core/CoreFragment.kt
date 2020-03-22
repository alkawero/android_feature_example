package com.example.androidfeatures.core

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.androidfeatures.R

class CoreFragment : Fragment() {

    private lateinit var coreViewModel: CoreViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        coreViewModel =
            ViewModelProviders.of(this).get(CoreViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_core, container, false)
        return root
    }
}
