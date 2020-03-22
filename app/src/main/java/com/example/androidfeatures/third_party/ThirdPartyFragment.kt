package com.example.androidfeatures.third_party

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.androidfeatures.R

class ThirdPartyFragment : Fragment() {

    private lateinit var thirdPartyViewModel: ThirdPartyViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        thirdPartyViewModel =
            ViewModelProviders.of(this).get(ThirdPartyViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_third_party, container, false)
        return root
    }
}
