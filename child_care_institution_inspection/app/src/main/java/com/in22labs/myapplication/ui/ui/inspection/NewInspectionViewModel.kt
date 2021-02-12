package com.in22labs.myapplication.ui.ui.inspection

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NewInspectionViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "No Status"
    }
    val text: LiveData<String> = _text
}