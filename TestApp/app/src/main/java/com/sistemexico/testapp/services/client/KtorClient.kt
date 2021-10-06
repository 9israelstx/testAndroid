package com.sistemexico.testapp.services.client

import android.content.Context
import com.sistemexico.schoolmanageralumntutor.infraestructure.configuration.Const
import com.sistemexico.testapp.services.response.ClientResponse
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.content.*
import io.ktor.http.*

class KtorClient {
    private lateinit var client : HttpClient
    lateinit var context : Context

    suspend fun Get(url:String): ClientResponse {
        client = HttpClient(CIO){
            install(HttpTimeout){
                requestTimeoutMillis = Const.REQUEST_TIME_OUT.toLong()
            }
        }
        var baseRespose = ClientResponse()
        try {
            val httpResponse = client.get<HttpResponse>(url){
                val httpResponse = client.get<HttpResponse>(url){
                    headers{
                        append("Accept", "application/json")
                    }
                }
            }

            if(httpResponse.status == HttpStatusCode.OK){
                baseRespose.status =  httpResponse.status
                baseRespose.code =  httpResponse.status.value
                baseRespose.result =  httpResponse.readText()
            }else{
                baseRespose.status =  httpResponse.status
                baseRespose.code =  httpResponse.status.value
                baseRespose.result =  httpResponse.readText()
            }
        }catch (ex: ClientRequestException){
            baseRespose.status = ex.response.status
            baseRespose.message = ex.message.toString()
            baseRespose.code = ex.response.status.value
            baseRespose.result = ex.response.readText()
        }
        finally {
            client.close()
        }
        return baseRespose
    }
    suspend fun Post(url:String,requestJson:String):ClientResponse{
        client = HttpClient(CIO){
            install(HttpTimeout){
                requestTimeoutMillis = Const.REQUEST_TIME_OUT.toLong()
            }
        }
        var baseRespose = ClientResponse()
        try {
            val httpResponse = client.post<HttpResponse>(url){
                body = TextContent(
                    text = requestJson,
                    contentType = ContentType.Application.Json
                )
            }
            if(httpResponse.status == HttpStatusCode.OK){
                baseRespose.status =  httpResponse.status
                baseRespose.code =  httpResponse.status.value
                baseRespose.result =  httpResponse.readText()
            }else{
                baseRespose.status =  httpResponse.status
                baseRespose.code =  httpResponse.status.value
                baseRespose.result =  httpResponse.readText()
            }
        }catch (ex: ClientRequestException){
            baseRespose.status = ex.response.status
            baseRespose.message = ex.message.toString()
            baseRespose.code = ex.response.status.value
            baseRespose.result = ex.response.readText()
        }
        finally {
            client.close()
        }
        return baseRespose
    }
    suspend fun Put(url:String, requestJson:String):ClientResponse{
        client = HttpClient(CIO)
        var baseRespose = ClientResponse()
        try {
            val httpResponse = client.put<HttpResponse>(url){
                body = TextContent(
                    text = requestJson,
                    contentType = ContentType.Application.Json
                )
            }
            if(httpResponse.status == HttpStatusCode.OK){
                baseRespose.status =  httpResponse.status
                baseRespose.code =  httpResponse.status.value
                baseRespose.result =  httpResponse.readText()
            }else{
                baseRespose.status =  httpResponse.status
                baseRespose.code =  httpResponse.status.value
                baseRespose.result =  httpResponse.readText()
            }

        }catch (ex: ClientRequestException){
            baseRespose.status = ex.response.status
            baseRespose.message = ex.message.toString()
            baseRespose.code = ex.response.status.value
            baseRespose.result = ex.response.readText()
        }
        finally {
            client.close()
        }
        return baseRespose
    }
    suspend fun Delete(url:String, requestJson:String):ClientResponse{
        client = HttpClient(CIO)
        var baseRespose = ClientResponse()
        try {
            val httpResponse = client.delete<HttpResponse>(url){
                body = TextContent(
                    text = requestJson,
                    contentType = ContentType.Application.Json
                )
            }
            if(httpResponse.status == HttpStatusCode.OK){
                baseRespose.status =  httpResponse.status
                baseRespose.code =  httpResponse.status.value
                baseRespose.result =  httpResponse.readText()
            }else{
                baseRespose.status =  httpResponse.status
                baseRespose.code =  httpResponse.status.value
                baseRespose.result =  httpResponse.readText()
            }
        }catch (ex: ClientRequestException){
            baseRespose.status = ex.response.status
            baseRespose.message = ex.message.toString()
            baseRespose.code = ex.response.status.value
            baseRespose.result = ex.response.readText()
        }
        finally {
            client.close()
        }
        return baseRespose
    }

}