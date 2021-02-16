package com.in22labs.myapplication.ui.ui

import com.in22labs.myapplication.model.InspInputField
import com.in22labs.myapplication.model.InspectionData

class UiUtils {

    companion object {
        var inceptionDataList: MutableList<InspectionData> = mutableListOf()
    }

    fun updateList() {
        val inspInputField_1 = InspInputField(
            questions = "2 dormitories each 1000 sq ft for 25 children ie. 2000 sq ft",
            typeOfInput = 1, remarksType = 1
        )
        val inspInputField_2 = InspInputField(
            questions = "2 classrooms 300 sq ft for 25 children ie. 600 sq ft",
            typeOfInput = 1, remarksType = 1
        )
        val inspInputField_3 = InspInputField(
            questions = "Sick room/ first aid room - 75 sq ft for 10 children",
            typeOfInput = 1, remarksType = 1
        )
        val inspInputField_4 = InspInputField(
            questions = "Kitchen 250 sq ft",
            typeOfInput = 1, remarksType = 1
        )
        val inspInputField_5 = InspInputField(
            questions = "Dining hall 800 sq ft",
            typeOfInput = 1, remarksType = 1
        )

        val inspInputField_21 = InspInputField(
            questions = "Sufficient purified drinking water, water filter",
            typeOfInput = 1, remarksType = 1
        )
        val inspInputField_22 = InspInputField(
            questions = "Sufficient water for bathing and washing cloths maintenance and cleanliness of the premises",
            typeOfInput = 1, remarksType = 1
        )
        val inspInputField_23 = InspInputField(
            questions = "Arrangements for disposal of garbage",
            typeOfInput = 1, remarksType = 1
        )
        val inspInputField_24 = InspInputField(
            questions = "Protection from mosquitoes by providing mosquito nets",
            typeOfInput = 1, remarksType = 1
        )

        val insFieldList_1 = mutableListOf<InspInputField>()
        val insFieldList_2 = mutableListOf<InspInputField>()


        insFieldList_1.add(inspInputField_1)
        insFieldList_1.add(inspInputField_2)
        insFieldList_1.add(inspInputField_3)
        insFieldList_1.add(inspInputField_4)
        insFieldList_1.add(inspInputField_5)

        insFieldList_2.add(inspInputField_21)
        insFieldList_2.add(inspInputField_21)
        insFieldList_2.add(inspInputField_21)
        insFieldList_2.add(inspInputField_21)

        inceptionDataList.add(InspectionData("Building and accommodation", insFieldList_1))
        inceptionDataList.add(InspectionData("Sanitation and hygiene", insFieldList_2))
        inceptionDataList.add(InspectionData("Staff Pattern", insFieldList_2))
        inceptionDataList.add(InspectionData("Minimum standard of Service", insFieldList_2))
        inceptionDataList.add(InspectionData("Rehabilitation and social re integration", insFieldList_2))
        inceptionDataList.add(InspectionData("Home Management Committee", insFieldList_2))
        inceptionDataList.add(InspectionData("Others", insFieldList_2))

    }
}