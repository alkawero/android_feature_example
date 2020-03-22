package com.example.androidfeatures.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.androidfeatures.R
import com.example.androidfeatures.actionbar.ActionBarActivity
import kotlinx.android.synthetic.main.fragment_ui.view.*

class UiFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val uiFragment = inflater.inflate(R.layout.fragment_ui, container, false)
        uiFragment.btn_action_bar.setOnClickListener(){ v -> btnActionBarOnClick(v)}
        return uiFragment
    }

    private fun btnActionBarOnClick(v : View){
        val intent = Intent(activity, ActionBarActivity::class.java)
        activity?.startActivity(intent)
    }


}
