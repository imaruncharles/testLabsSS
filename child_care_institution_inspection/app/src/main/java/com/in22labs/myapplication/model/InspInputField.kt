package com.in22labs.myapplication.model

//typeOfInput 0= input String, 1= input boolean
//remarksType 0 = no remarks, 1 = add remarks
data class InspInputField(
    var questions: String = "",
    var inputData: String = "",
    var typeOfInput: Int = 0,
    var isYesNo: Boolean = false,
    var remarksType: Int = 0
)