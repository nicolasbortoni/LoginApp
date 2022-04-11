package com.utn.loginapp.entities

class UserResource {
    val usrList : MutableList<User> = mutableListOf();
    init {
        usrList.add(User("nicobortoni","1234","nicolas@gmail.com",25))
        usrList.add(User("ailuugolini","5678","ailin@gmail.com",24))
        usrList.add(User("chinosirito","9876","chino@gmail.com",25))
        usrList.add(User("alanmuska","5432","alan@gmail.com",28))
        usrList.add(User("juanreiszer","0000","jfri@gmail.com",25))
    }
}