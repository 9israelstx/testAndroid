package com.sistemexico.testapp.services.serviceApi

import android.content.Context
import com.google.gson.Gson
import com.sistemexico.schoolmanageralumntutor.infraestructure.configuration.Const
import com.sistemexico.schoolmanageralumntutor.infraestructure.configuration.service.ServiceSM
import com.sistemexico.testapp.services.client.KtorClient
import com.sistemexico.testapp.services.response.ClientResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

class UserService(val context: Context) {
    private val ktorClient = KtorClient()
    private var gson = Gson()

    init {
        ktorClient.context = context
    }

    suspend fun findUser(url:String): ClientResponse {
        var result = ClientResponse()
        runBlocking{
            try {
                val response = withContext(Dispatchers.IO){
                    ktorClient.Get(url)
                }
                result = response
            }catch (ex:Exception){
            }finally {
            }
        }
        return  result
    }
}