package com.sistemexico.testapp.services.response


class BaseResponse : OpenBaseResponse(){
    lateinit var  data : MutableList<*>  //MutableList<Type> = arrayListOf()
}