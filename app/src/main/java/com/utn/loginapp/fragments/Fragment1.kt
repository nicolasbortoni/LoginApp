package com.utn.loginapp.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.utn.loginapp.R
import com.utn.loginapp.viewmode.Fragment1ViewModel
import androidx.navigation.findNavController
import android.widget.Button
import android.widget.EditText
import com.utn.loginapp.entities.User
import com.google.android.material.snackbar.Snackbar

class Fragment1 : Fragment() {

    lateinit var v : View
    lateinit var btnLogin : Button
    lateinit var usrPlainText : EditText
    lateinit var pswPlainText : EditText
    var usrList : MutableList<User> = mutableListOf()

    companion object {
        fun newInstance() = Fragment1()
    }

    private lateinit var viewModel: Fragment1ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.fragment1_fragment, container, false)

        btnLogin = v.findViewById(R.id.btnLogin)
        usrPlainText = v.findViewById(R.id.usrPlainText)
        pswPlainText = v.findViewById(R.id.pswPlainText)

        usrList.add(User("nicobortoni","1234","nicolas@gmail.com",25))
        usrList.add(User("ailuugolini","5678","ailin@gmail.com",24))
        usrList.add(User("chinosirito","9876","chino@gmail.com",25))
        usrList.add(User("alanmuska","5432","alan@gmail.com",28))

        return v
    }

    override fun onStart() {
        super.onStart()
        btnLogin.setOnClickListener {

            var usrAux = usrList.find { it.name == usrPlainText.text.toString() }

            if (usrAux == null) {Snackbar.make(v,"Nombre de usuario inválido",Snackbar.LENGTH_SHORT).show()}
            else{
                if(usrAux.pass == pswPlainText.text.toString()){
                    val action = Fragment1Directions.actionFragment12ToFragment22()
                    v.findNavController().navigate(action)
                }
                else{
                    Snackbar.make(v,"Contraseña incorrecta",Snackbar.LENGTH_SHORT).show()
                }
            }
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Fragment1ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}