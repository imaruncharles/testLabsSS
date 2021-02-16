package com.in22labs.myapplication.ui.ui.inspection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.in22labs.myapplication.R
import com.in22labs.myapplication.databinding.ActivityInspectionTestBinding
import com.in22labs.myapplication.databinding.DcpoInspectionFormHomeBinding

class InspectionTestActivity : AppCompatActivity() {
    private lateinit var activityInspectionTestBinding: ActivityInspectionTestBinding
    private lateinit var dcpoInspectionFormHomeBinding: DcpoInspectionFormHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = activityInspectionTestBinding.root
        dcpoInspectionFormHomeBinding = activityInspectionTestBinding.cciIntroFormInclude
        setContentView(view)

        dcpoInspectionFormHomeBinding.cciInspectionIntroNextBtn.setOnClickListener {

        }
    }
}