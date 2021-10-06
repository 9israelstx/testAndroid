package com.sistemexico.schoolmanageralumntutor.infraestructure.configuration.error

class ErrorCodeOpenPay {
    companion object {
        //Cambiar a mayusculas, vol velocidad se tomo de go
        const val Internal_Server_Error_1000 = "1000"
        const val Bad_Request_1001 = "1001"
        const val Unauthorized_1002 = "1002"
        const val Unprocessable_Entity_1003 = "1003"
        const val Service_Unavaible_1004 = "1004"
        const val Not_Found_1005 = "1005"
        const val Conflict_1006 = "1006"
        const val Payment_Requeried_1007 = "1007"
        const val Locked_1008 = "1008"
        const val Request_Entity_Too_Large_1009 = "1009"
        const val Forbidden_1010 = "1010"
        const val Not_Found_1011 = "1011"
        const val Precondition_Failed_1012 = "1012"
        const val Precondition_Failed_1013 = "1013"
        const val Unauthorized_1014 = "1014"
        const val Gateway_Timeout_1015 = "1015"
        const val Conflict_1016 = "1016"
        const val Bad_Gateway_1017 = "1017"
        const val Payment_Required_1018 = "1018"
        const val Bad_Request_1020 = "1020"
        const val Precondition_Failed_1023 = "1023"
        const val Precondition_Failed_1024 = "1024"
        const val Precondition_Failed_1025 = "1025"
        const val Conflict_2001 = "2001"
        const val Conflict_2003 = "2003"
        const val Unprocessable_Entity_2004 = "2004"
        const val Bad_Request_2005 = "2005"
        const val Bad_Request_2006 = "2006"
        const val Precondition_Failed_2007 = "2007"
        const val Precondition_Failed_2008 = "2008"
        const val Precondition_Failed_2009 = "2009"
        const val Payment_Required_2010 = "2010"
        const val Unprocessable_Entity_2011 = "2011"
        const val Payment_Required_3001 = "3001"
        const val Payment_Required_3002 = "3002"
        const val Payment_Required_3003 = "3003"
        const val Payment_Required_3004 = "3004"
        const val Payment_Required_3005 = "3005"
        const val Precondition_Failed_3006 = "3006"
        const val Payment_Required_3009 = "3009"
        const val Payment_Required_3010 = "3010"
        const val Payment_Required_3011 = "3011"
        const val Precondition_Failed_3012 = "3012"
        const val Precondition_Failed_3201 = "3201"
        const val Precondition_Failed_3203 = "3203"
        const val Precondition_Failed_3204 = "3204"
        const val Precondition_Failed_3205 = "3205"
        const val Precondition_Failed_4001 = "4001"
        const val Precondition_Failed_4002 = "4002"
        const val Conflict_6001 = "6001"
        const val Precondition_Failed_6002 = "6002"
        const val Bad_Gateway_6003 = "6003"
    }

    fun existCode(status:String):Boolean{

        when(status) {
            Internal_Server_Error_1000 -> {
                return true
            }
            Bad_Request_1001 -> {
                return true
            }
            Unauthorized_1002 -> {
                return true
            }
            Unprocessable_Entity_1003 -> {
                return true
            }
            Service_Unavaible_1004 -> {
                return true
            }
            Not_Found_1005 -> {
                return true
            }
            Conflict_1006 -> {
                return true
            }
            Payment_Requeried_1007 -> {
                return true
            }
            Locked_1008 -> {
                return true
            }
            Request_Entity_Too_Large_1009 -> {
                return true
            }
            Forbidden_1010 -> {
                return true
            }
            Not_Found_1011 -> {
                return true
            }
            Precondition_Failed_1012 -> {
                return true
            }
            Precondition_Failed_1013 -> {
                return true
            }
            Unauthorized_1014 -> {
                return true
            }
            Gateway_Timeout_1015 -> {
                return true
            }
            Conflict_1016 -> {
                return true
            }
            Bad_Gateway_1017 -> {
                return true
            }
            Payment_Required_1018 -> {
                return true
            }
            Bad_Request_1020 -> {
                return true
            }
            Precondition_Failed_1023 -> {
                return true
            }
            Precondition_Failed_1024 -> {
                return true
            }
            Precondition_Failed_1025 -> {
                return true
            }
            Conflict_2001 -> {
                return true
            }
            Conflict_2003 -> {
                return true
            }
            Unprocessable_Entity_2004 -> {
                return true
            }
            Bad_Request_2005 -> {
                return true
            }
            Bad_Request_2006 -> {
                return true
            }
            Precondition_Failed_2007 -> {
                return true
            }
            Precondition_Failed_2008 -> {
                return true
            }
            Precondition_Failed_2009 -> {
                return true
            }
            Payment_Required_2010 -> {
                return true
            }
            Unprocessable_Entity_2011 -> {
                return true
            }
            Payment_Required_3001 -> {
                return true
            }
            Payment_Required_3002 -> {
                return true
            }
            Payment_Required_3003 -> {
                return true
            }
            Payment_Required_3004 -> {
                return true
            }
            Payment_Required_3005 -> {
                return true
            }
            Precondition_Failed_3006 -> {
                return true
            }
            Payment_Required_3009 -> {
                return true
            }
            Payment_Required_3010 -> {
                return true
            }
            Payment_Required_3011 -> {
                return true
            }
            Precondition_Failed_3012 -> {
                return true
            }
            Precondition_Failed_3201 -> {
                return true
            }
            Precondition_Failed_3203 -> {
                return true
            }
            Precondition_Failed_3204 -> {
                return true
            }
            Precondition_Failed_3205 -> {
                return true
            }
            Precondition_Failed_4001 -> {
                return true
            }
            Precondition_Failed_4002 -> {
                return true
            }
            Conflict_6001 -> {
                return true
            }
            Precondition_Failed_6002 -> {
                return true
            }
            Bad_Gateway_6003 -> {
                return true
            }
            else -> {
                return false
            }
        }
    }
}