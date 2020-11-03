package com.foxcode.livedata_mvvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.fragment_blank2.*


class BlankFragment2 : Fragment() {

    lateinit var fragmentViewModel: FragmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank2, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        fragmentViewModel = activity!!.run {
            ViewModelProviders.of(this).get(FragmentViewModel::class.java)
        }

        fragmentViewModel.getString().observe(this, object : Observer<String>{
            override fun onChanged(t: String?) {
                textView.text = t
            }
        })



    }
}