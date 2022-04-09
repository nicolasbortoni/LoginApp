package com.utn.loginapp.entities

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class User(
    var name : String,
    var pass : String,
    var mail : String,
    var age : Int
    ) : Parcelable
{

}