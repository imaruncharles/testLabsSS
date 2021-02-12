package com.in22labs.myapplication.ui.ui.documentVerification

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.in22labs.myapplication.R

class DocumentVerificationFragment : Fragment() {

    companion object {
        fun newInstance() = DocumentVerificationFragment()
    }

    private lateinit var viewModel: DocumentVerificationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.document_verification_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DocumentVerificationViewModel::class.java)
        // TODO: Use the ViewModel
    }

}