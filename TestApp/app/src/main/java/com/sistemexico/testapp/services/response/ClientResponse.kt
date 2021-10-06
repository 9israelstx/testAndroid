package com.sistemexico.testapp.services.response

import io.ktor.http.*

class ClientResponse {
    var status: HttpStatusCode? = null
    var code: Int? = null
    var message: String = ""
    var error: String = ""
    var result: String = ""
}