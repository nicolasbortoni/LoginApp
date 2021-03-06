package com.utn.loginapp.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.utn.loginapp.R
import com.utn.loginapp.viewmode.Fragment2ViewModel
import android.widget.TextView
import com.utn.loginapp.entities.User

class Fragment2 : Fragment() {

    lateinit var v : View
    lateinit var txtMessage : TextView
    lateinit var usr : User

    companion object {
        fun newInstance() = Fragment2()
    }

    private lateinit var viewModel: Fragment2ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.fragment2_fragment, container, false)
        txtMessage = v.findViewById(R.id.txtMessage)
        return v
    }

    override fun onStart() {
        super.onStart()
        usr = Fragment2Args.fromBundle(requireArguments()).usrLoged
        txtMessage.text = "Bienvenido " + usr.name + "!"
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Fragment2ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}