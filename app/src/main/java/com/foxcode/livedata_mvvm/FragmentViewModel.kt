package com.foxcode.livedata_mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FragmentViewModel : ViewModel() {

    val mutableLiveData = MutableLiveData<String>()

    fun setString(s:String)
    {
        mutableLiveData.value = s
    }

    fun getString() : LiveData<String> {
        return mutableLiveData
    }

}