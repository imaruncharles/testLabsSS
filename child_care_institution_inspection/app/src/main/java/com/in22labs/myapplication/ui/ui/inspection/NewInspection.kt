package com.in22labs.myapplication.ui.ui.inspection

import android.os.Bundle
import android.text.format.DateFormat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.datepicker.MaterialDatePicker
import com.google.android.material.textfield.TextInputEditText
import com.in22labs.myapplication.databinding.*
import java.util.*

class NewInspection : Fragment() {

    private lateinit var newInspectionViewModel: NewInspectionViewModel
    private lateinit var activityCciInspectionFormBinding: ActivityCciInspectionFormBinding
    private lateinit var cciInspectionInstituationFormBinding: CciInspectionInstituationFormBinding
    private lateinit var buildingAccommodationBinding: BuildingAccommodationBinding
    private lateinit var sanitationHygieneViewBinding: SanitationHygieneViewBinding
    private lateinit var staffPatternFormViewBinding: StaffPatternFormViewBinding
    private lateinit var medicalFecilitiesViewBinding: MedicalFecilitiesViewBinding
    private lateinit var dietScaleViewBinding: DietScaleViewBinding
    private lateinit var clothingBeddingViewBinding: ClothingBeddingViewBinding
    private lateinit var dailyRoutineViewBinding: DailyRoutineViewBinding
    private lateinit var educationViewBinding: EducationViewBinding
    private lateinit var vocationalTrainingViewBinding: VocationalTrainingViewBinding
    private lateinit var specialUnitChildrenViewBinding: SpecialUnitChildrenViewBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        activityCciInspectionFormBinding = ActivityCciInspectionFormBinding.inflate(layoutInflater)
        cciInspectionInstituationFormBinding = activityCciInspectionFormBinding.cciInspectionInstitutionFormLayout
        buildingAccommodationBinding = activityCciInspectionFormBinding.buildingAccommodationIncludeLay
        sanitationHygieneViewBinding = activityCciInspectionFormBinding.sanitationHygieneViewIncludeLay
        staffPatternFormViewBinding = activityCciInspectionFormBinding.staffPatternFormViewIncludeLay
        medicalFecilitiesViewBinding = activityCciInspectionFormBinding.medicalFacilityIncludeView
        dietScaleViewBinding = activityCciInspectionFormBinding.dietScaleIncludeLay
       clothingBeddingViewBinding = activityCciInspectionFormBinding.clothingBeddingIncludeLay
        dailyRoutineViewBinding = activityCciInspectionFormBinding.dailyRoutineIncludeLay
        educationViewBinding = activityCciInspectionFormBinding.educationIncludeLay
        vocationalTrainingViewBinding = activityCciInspectionFormBinding.vocationalTrainingIncludeLay
        specialUnitChildrenViewBinding = activityCciInspectionFormBinding.specialUnitChildrenIncludeLay


        val view = activityCciInspectionFormBinding.root


        newInspectionViewModel = ViewModelProvider(this).get(NewInspectionViewModel::class.java)

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        cciInspectionInstituationFormBinding.cciInstitutionConstraintLay.visibility = View.VISIBLE
        buildingAccommodationBinding.buildingAndAccommodationConstraintLay.visibility = View.GONE
        sanitationHygieneViewBinding.sanitationHygieneConstraintlayout.visibility = View.GONE
        staffPatternFormViewBinding.staffPatternConstraintLayout.visibility = View.GONE
        medicalFecilitiesViewBinding.medicalFacilityConstraintLayout.visibility = View.GONE
        dietScaleViewBinding.dietScaleConstraintLay.visibility = View.GONE
        clothingBeddingViewBinding.clothingBeddingConstraintLay.visibility = View.GONE
        dailyRoutineViewBinding.dailyRoutineConstraintLay.visibility = View.GONE
        educationViewBinding.educationConstraint.visibility = View.GONE
        vocationalTrainingViewBinding.vocationTrainingConstraintLay.visibility = View.GONE
        specialUnitChildrenViewBinding.specialUnitChildrenConstraintLay.visibility = View.GONE

        cciInspectionInstituationFormBinding.institutionFormNextBtn.setOnClickListener {
            cciInspectionInstituationFormBinding.cciInstitutionConstraintLay.visibility = View.GONE
            buildingAccommodationBinding.buildingAndAccommodationConstraintLay.visibility = View.VISIBLE
            sanitationHygieneViewBinding.sanitationHygieneConstraintlayout.visibility = View.GONE
            staffPatternFormViewBinding.staffPatternConstraintLayout.visibility = View.GONE
            medicalFecilitiesViewBinding.medicalFacilityConstraintLayout.visibility = View.GONE
            dietScaleViewBinding.dietScaleConstraintLay.visibility = View.GONE
            clothingBeddingViewBinding.clothingBeddingConstraintLay.visibility = View.GONE
            dailyRoutineViewBinding.dailyRoutineConstraintLay.visibility = View.GONE
            educationViewBinding.educationConstraint.visibility = View.GONE
            vocationalTrainingViewBinding.vocationTrainingConstraintLay.visibility = View.GONE
            scrollViewTop()
        }


        buildingAccommodationBinding.buildAccommodationBack.setOnClickListener {
            cciInspectionInstituationFormBinding.cciInstitutionConstraintLay.visibility = View.VISIBLE
            buildingAccommodationBinding.buildingAndAccommodationConstraintLay.visibility = View.GONE
            sanitationHygieneViewBinding.sanitationHygieneConstraintlayout.visibility = View.GONE
            staffPatternFormViewBinding.staffPatternConstraintLayout.visibility = View.GONE
            medicalFecilitiesViewBinding.medicalFacilityConstraintLayout.visibility = View.GONE
            dietScaleViewBinding.dietScaleConstraintLay.visibility = View.GONE
            clothingBeddingViewBinding.clothingBeddingConstraintLay.visibility = View.GONE
            dailyRoutineViewBinding.dailyRoutineConstraintLay.visibility = View.GONE
            educationViewBinding.educationConstraint.visibility = View.GONE
            vocationalTrainingViewBinding.vocationTrainingConstraintLay.visibility = View.GONE
            scrollViewTop()
        }
        buildingAccommodationBinding.buildAccommodationNext.setOnClickListener {
            cciInspectionInstituationFormBinding.cciInstitutionConstraintLay.visibility = View.GONE
            buildingAccommodationBinding.buildingAndAccommodationConstraintLay.visibility = View.GONE
            sanitationHygieneViewBinding.sanitationHygieneConstraintlayout.visibility = View.VISIBLE
            staffPatternFormViewBinding.staffPatternConstraintLayout.visibility = View.GONE
            medicalFecilitiesViewBinding.medicalFacilityConstraintLayout.visibility = View.GONE
            dietScaleViewBinding.dietScaleConstraintLay.visibility = View.GONE
            clothingBeddingViewBinding.clothingBeddingConstraintLay.visibility = View.GONE
            dailyRoutineViewBinding.dailyRoutineConstraintLay.visibility = View.GONE
            educationViewBinding.educationConstraint.visibility = View.GONE
            vocationalTrainingViewBinding.vocationTrainingConstraintLay.visibility = View.GONE
            scrollViewTop()
        }


        sanitationHygieneViewBinding.sanitationBack.setOnClickListener {
            cciInspectionInstituationFormBinding.cciInstitutionConstraintLay.visibility = View.GONE
            buildingAccommodationBinding.buildingAndAccommodationConstraintLay.visibility = View.VISIBLE
            sanitationHygieneViewBinding.sanitationHygieneConstraintlayout.visibility = View.GONE
            staffPatternFormViewBinding.staffPatternConstraintLayout.visibility = View.GONE
            medicalFecilitiesViewBinding.medicalFacilityConstraintLayout.visibility = View.GONE
            dietScaleViewBinding.dietScaleConstraintLay.visibility = View.GONE
            clothingBeddingViewBinding.clothingBeddingConstraintLay.visibility = View.GONE
            dailyRoutineViewBinding.dailyRoutineConstraintLay.visibility = View.GONE
            educationViewBinding.educationConstraint.visibility = View.GONE
            vocationalTrainingViewBinding.vocationTrainingConstraintLay.visibility = View.GONE
            scrollViewTop()
        }


        sanitationHygieneViewBinding.sanitationNext.setOnClickListener {
            cciInspectionInstituationFormBinding.cciInstitutionConstraintLay.visibility = View.GONE
            buildingAccommodationBinding.buildingAndAccommodationConstraintLay.visibility = View.GONE
            sanitationHygieneViewBinding.sanitationHygieneConstraintlayout.visibility = View.GONE
            staffPatternFormViewBinding.staffPatternConstraintLayout.visibility = View.VISIBLE
            medicalFecilitiesViewBinding.medicalFacilityConstraintLayout.visibility = View.GONE
            dietScaleViewBinding.dietScaleConstraintLay.visibility = View.GONE
            clothingBeddingViewBinding.clothingBeddingConstraintLay.visibility = View.GONE
            dailyRoutineViewBinding.dailyRoutineConstraintLay.visibility = View.GONE
            educationViewBinding.educationConstraint.visibility = View.GONE
            vocationalTrainingViewBinding.vocationTrainingConstraintLay.visibility = View.GONE
            scrollViewTop()
        }

        staffPatternFormViewBinding.staffPatternBack.setOnClickListener {
            cciInspectionInstituationFormBinding.cciInstitutionConstraintLay.visibility = View.GONE
            buildingAccommodationBinding.buildingAndAccommodationConstraintLay.visibility = View.GONE
            sanitationHygieneViewBinding.sanitationHygieneConstraintlayout.visibility = View.VISIBLE
            staffPatternFormViewBinding.staffPatternConstraintLayout.visibility = View.GONE
            medicalFecilitiesViewBinding.medicalFacilityConstraintLayout.visibility = View.GONE
            dietScaleViewBinding.dietScaleConstraintLay.visibility = View.GONE
            clothingBeddingViewBinding.clothingBeddingConstraintLay.visibility = View.GONE
            dailyRoutineViewBinding.dailyRoutineConstraintLay.visibility = View.GONE
            educationViewBinding.educationConstraint.visibility = View.GONE
            vocationalTrainingViewBinding.vocationTrainingConstraintLay.visibility = View.GONE
            scrollViewTop()
        }

        staffPatternFormViewBinding.staffPatternNext.setOnClickListener {
            cciInspectionInstituationFormBinding.cciInstitutionConstraintLay.visibility = View.GONE
            buildingAccommodationBinding.buildingAndAccommodationConstraintLay.visibility = View.GONE
            sanitationHygieneViewBinding.sanitationHygieneConstraintlayout.visibility = View.GONE
            staffPatternFormViewBinding.staffPatternConstraintLayout.visibility = View.GONE
            medicalFecilitiesViewBinding.medicalFacilityConstraintLayout.visibility = View.VISIBLE
            dietScaleViewBinding.dietScaleConstraintLay.visibility = View.GONE
            clothingBeddingViewBinding.clothingBeddingConstraintLay.visibility = View.GONE
            educationViewBinding.educationConstraint.visibility = View.GONE
            vocationalTrainingViewBinding.vocationTrainingConstraintLay.visibility = View.GONE
            scrollViewTop()
        }

        medicalFecilitiesViewBinding.medicalFacilityBack.setOnClickListener{
            cciInspectionInstituationFormBinding.cciInstitutionConstraintLay.visibility = View.GONE
            buildingAccommodationBinding.buildingAndAccommodationConstraintLay.visibility = View.GONE
            sanitationHygieneViewBinding.sanitationHygieneConstraintlayout.visibility = View.GONE
            staffPatternFormViewBinding.staffPatternConstraintLayout.visibility = View.VISIBLE
            medicalFecilitiesViewBinding.medicalFacilityConstraintLayout.visibility = View.GONE
            dietScaleViewBinding.dietScaleConstraintLay.visibility = View.GONE
            clothingBeddingViewBinding.clothingBeddingConstraintLay.visibility = View.GONE
            dailyRoutineViewBinding.dailyRoutineConstraintLay.visibility = View.GONE
            educationViewBinding.educationConstraint.visibility = View.GONE
            vocationalTrainingViewBinding.vocationTrainingConstraintLay.visibility = View.GONE
            scrollViewTop()
        }

        medicalFecilitiesViewBinding.medicalFacilityNext.setOnClickListener{
            cciInspectionInstituationFormBinding.cciInstitutionConstraintLay.visibility = View.GONE
            buildingAccommodationBinding.buildingAndAccommodationConstraintLay.visibility = View.GONE
            sanitationHygieneViewBinding.sanitationHygieneConstraintlayout.visibility = View.GONE
            staffPatternFormViewBinding.staffPatternConstraintLayout.visibility = View.GONE
            medicalFecilitiesViewBinding.medicalFacilityConstraintLayout.visibility = View.GONE
            dietScaleViewBinding.dietScaleConstraintLay.visibility = View.VISIBLE
            clothingBeddingViewBinding.clothingBeddingConstraintLay.visibility = View.GONE
            dailyRoutineViewBinding.dailyRoutineConstraintLay.visibility = View.GONE
            educationViewBinding.educationConstraint.visibility = View.GONE
            vocationalTrainingViewBinding.vocationTrainingConstraintLay.visibility = View.GONE
            scrollViewTop()
        }

        dietScaleViewBinding.dietScaleBack.setOnClickListener{
            cciInspectionInstituationFormBinding.cciInstitutionConstraintLay.visibility = View.GONE
            buildingAccommodationBinding.buildingAndAccommodationConstraintLay.visibility = View.GONE
            sanitationHygieneViewBinding.sanitationHygieneConstraintlayout.visibility = View.GONE
            staffPatternFormViewBinding.staffPatternConstraintLayout.visibility = View.GONE
            medicalFecilitiesViewBinding.medicalFacilityConstraintLayout.visibility = View.VISIBLE
            dietScaleViewBinding.dietScaleConstraintLay.visibility = View.GONE
            clothingBeddingViewBinding.clothingBeddingConstraintLay.visibility = View.GONE
            dailyRoutineViewBinding.dailyRoutineConstraintLay.visibility = View.GONE
            educationViewBinding.educationConstraint.visibility = View.GONE
            vocationalTrainingViewBinding.vocationTrainingConstraintLay.visibility = View.GONE
            scrollViewTop()
        }

        dietScaleViewBinding.dietScaleNext.setOnClickListener{
            cciInspectionInstituationFormBinding.cciInstitutionConstraintLay.visibility = View.GONE
            buildingAccommodationBinding.buildingAndAccommodationConstraintLay.visibility = View.GONE
            sanitationHygieneViewBinding.sanitationHygieneConstraintlayout.visibility = View.GONE
            staffPatternFormViewBinding.staffPatternConstraintLayout.visibility = View.GONE
            medicalFecilitiesViewBinding.medicalFacilityConstraintLayout.visibility = View.GONE
            dietScaleViewBinding.dietScaleConstraintLay.visibility = View.GONE
            clothingBeddingViewBinding.clothingBeddingConstraintLay.visibility = View.VISIBLE
            dailyRoutineViewBinding.dailyRoutineConstraintLay.visibility = View.GONE
            educationViewBinding.educationConstraint.visibility = View.GONE
            vocationalTrainingViewBinding.vocationTrainingConstraintLay.visibility = View.GONE
            scrollViewTop()
        }

        clothingBeddingViewBinding.clothingBeddingBack.setOnClickListener{
            cciInspectionInstituationFormBinding.cciInstitutionConstraintLay.visibility = View.GONE
            buildingAccommodationBinding.buildingAndAccommodationConstraintLay.visibility = View.GONE
            sanitationHygieneViewBinding.sanitationHygieneConstraintlayout.visibility = View.GONE
            staffPatternFormViewBinding.staffPatternConstraintLayout.visibility = View.GONE
            medicalFecilitiesViewBinding.medicalFacilityConstraintLayout.visibility = View.GONE
            dietScaleViewBinding.dietScaleConstraintLay.visibility = View.VISIBLE
            clothingBeddingViewBinding.clothingBeddingConstraintLay.visibility = View.GONE
            dailyRoutineViewBinding.dailyRoutineConstraintLay.visibility = View.GONE
            educationViewBinding.educationConstraint.visibility = View.GONE
            vocationalTrainingViewBinding.vocationTrainingConstraintLay.visibility = View.GONE
            scrollViewTop()
        }

        clothingBeddingViewBinding.clothingBeddingNext.setOnClickListener {
            cciInspectionInstituationFormBinding.cciInstitutionConstraintLay.visibility = View.GONE
            buildingAccommodationBinding.buildingAndAccommodationConstraintLay.visibility = View.GONE
            sanitationHygieneViewBinding.sanitationHygieneConstraintlayout.visibility = View.GONE
            staffPatternFormViewBinding.staffPatternConstraintLayout.visibility = View.GONE
            medicalFecilitiesViewBinding.medicalFacilityConstraintLayout.visibility = View.GONE
            dietScaleViewBinding.dietScaleConstraintLay.visibility = View.GONE
            clothingBeddingViewBinding.clothingBeddingConstraintLay.visibility = View.GONE
            dailyRoutineViewBinding.dailyRoutineConstraintLay.visibility = View.VISIBLE
            educationViewBinding.educationConstraint.visibility = View.GONE
            vocationalTrainingViewBinding.vocationTrainingConstraintLay.visibility = View.GONE
            scrollViewTop()
        }

        dailyRoutineViewBinding.dailyRoutineBack.setOnClickListener {
            cciInspectionInstituationFormBinding.cciInstitutionConstraintLay.visibility = View.GONE
            buildingAccommodationBinding.buildingAndAccommodationConstraintLay.visibility = View.GONE
            sanitationHygieneViewBinding.sanitationHygieneConstraintlayout.visibility = View.GONE
            staffPatternFormViewBinding.staffPatternConstraintLayout.visibility = View.GONE
            medicalFecilitiesViewBinding.medicalFacilityConstraintLayout.visibility = View.GONE
            dietScaleViewBinding.dietScaleConstraintLay.visibility = View.GONE
            clothingBeddingViewBinding.clothingBeddingConstraintLay.visibility = View.VISIBLE
            dailyRoutineViewBinding.dailyRoutineConstraintLay.visibility = View.GONE
            educationViewBinding.educationConstraint.visibility = View.GONE
            vocationalTrainingViewBinding.vocationTrainingConstraintLay.visibility = View.GONE
            scrollViewTop()
        }

        dailyRoutineViewBinding.dailyRoutineNext.setOnClickListener {
            cciInspectionInstituationFormBinding.cciInstitutionConstraintLay.visibility = View.GONE
            buildingAccommodationBinding.buildingAndAccommodationConstraintLay.visibility = View.GONE
            sanitationHygieneViewBinding.sanitationHygieneConstraintlayout.visibility = View.GONE
            staffPatternFormViewBinding.staffPatternConstraintLayout.visibility = View.GONE
            medicalFecilitiesViewBinding.medicalFacilityConstraintLayout.visibility = View.GONE
            dietScaleViewBinding.dietScaleConstraintLay.visibility = View.GONE
            clothingBeddingViewBinding.clothingBeddingConstraintLay.visibility = View.GONE
            dailyRoutineViewBinding.dailyRoutineConstraintLay.visibility = View.GONE
            educationViewBinding.educationConstraint.visibility = View.VISIBLE
            vocationalTrainingViewBinding.vocationTrainingConstraintLay.visibility = View.GONE
            scrollViewTop()
        }

        educationViewBinding.educationBack.setOnClickListener {
            cciInspectionInstituationFormBinding.cciInstitutionConstraintLay.visibility = View.GONE
            buildingAccommodationBinding.buildingAndAccommodationConstraintLay.visibility = View.GONE
            sanitationHygieneViewBinding.sanitationHygieneConstraintlayout.visibility = View.GONE
            staffPatternFormViewBinding.staffPatternConstraintLayout.visibility = View.GONE
            medicalFecilitiesViewBinding.medicalFacilityConstraintLayout.visibility = View.GONE
            dietScaleViewBinding.dietScaleConstraintLay.visibility = View.GONE
            clothingBeddingViewBinding.clothingBeddingConstraintLay.visibility = View.GONE
            dailyRoutineViewBinding.dailyRoutineConstraintLay.visibility = View.VISIBLE
            educationViewBinding.educationConstraint.visibility = View.GONE
            vocationalTrainingViewBinding.vocationTrainingConstraintLay.visibility = View.GONE
            scrollViewTop()
        }

        educationViewBinding.educationNext.setOnClickListener {
            cciInspectionInstituationFormBinding.cciInstitutionConstraintLay.visibility = View.GONE
            buildingAccommodationBinding.buildingAndAccommodationConstraintLay.visibility = View.GONE
            sanitationHygieneViewBinding.sanitationHygieneConstraintlayout.visibility = View.GONE
            staffPatternFormViewBinding.staffPatternConstraintLayout.visibility = View.GONE
            medicalFecilitiesViewBinding.medicalFacilityConstraintLayout.visibility = View.GONE
            dietScaleViewBinding.dietScaleConstraintLay.visibility = View.GONE
            clothingBeddingViewBinding.clothingBeddingConstraintLay.visibility = View.GONE
            dailyRoutineViewBinding.dailyRoutineConstraintLay.visibility = View.GONE
            educationViewBinding.educationConstraint.visibility = View.GONE
            vocationalTrainingViewBinding.vocationTrainingConstraintLay.visibility = View.VISIBLE
            scrollViewTop()
        }

        vocationalTrainingViewBinding.vocationTrainingBack.setOnClickListener {
            cciInspectionInstituationFormBinding.cciInstitutionConstraintLay.visibility = View.GONE
            buildingAccommodationBinding.buildingAndAccommodationConstraintLay.visibility = View.GONE
            sanitationHygieneViewBinding.sanitationHygieneConstraintlayout.visibility = View.GONE
            staffPatternFormViewBinding.staffPatternConstraintLayout.visibility = View.GONE
            medicalFecilitiesViewBinding.medicalFacilityConstraintLayout.visibility = View.GONE
            dietScaleViewBinding.dietScaleConstraintLay.visibility = View.GONE
            clothingBeddingViewBinding.clothingBeddingConstraintLay.visibility = View.GONE
            dailyRoutineViewBinding.dailyRoutineConstraintLay.visibility = View.GONE
            educationViewBinding.educationConstraint.visibility = View.VISIBLE
            vocationalTrainingViewBinding.vocationTrainingConstraintLay.visibility = View.GONE
            scrollViewTop()
        }

        vocationalTrainingViewBinding.vocationTrainingNext.setOnClickListener {
            cciInspectionInstituationFormBinding.cciInstitutionConstraintLay.visibility = View.GONE
            buildingAccommodationBinding.buildingAndAccommodationConstraintLay.visibility = View.GONE
            sanitationHygieneViewBinding.sanitationHygieneConstraintlayout.visibility = View.GONE
            staffPatternFormViewBinding.staffPatternConstraintLayout.visibility = View.GONE
            medicalFecilitiesViewBinding.medicalFacilityConstraintLayout.visibility = View.GONE
            dietScaleViewBinding.dietScaleConstraintLay.visibility = View.GONE
            clothingBeddingViewBinding.clothingBeddingConstraintLay.visibility = View.GONE
            dailyRoutineViewBinding.dailyRoutineConstraintLay.visibility = View.GONE
            educationViewBinding.educationConstraint.visibility = View.GONE
            vocationalTrainingViewBinding.vocationTrainingConstraintLay.visibility = View.GONE
            specialUnitChildrenViewBinding.specialUnitChildrenConstraintLay.visibility = View.VISIBLE
            scrollViewTop()
        }


        specialUnitChildrenViewBinding.specialUnitChildrenBack.setOnClickListener {
            cciInspectionInstituationFormBinding.cciInstitutionConstraintLay.visibility = View.GONE
            buildingAccommodationBinding.buildingAndAccommodationConstraintLay.visibility = View.GONE
            sanitationHygieneViewBinding.sanitationHygieneConstraintlayout.visibility = View.GONE
            staffPatternFormViewBinding.staffPatternConstraintLayout.visibility = View.GONE
            medicalFecilitiesViewBinding.medicalFacilityConstraintLayout.visibility = View.GONE
            dietScaleViewBinding.dietScaleConstraintLay.visibility = View.GONE
            clothingBeddingViewBinding.clothingBeddingConstraintLay.visibility = View.GONE
            dailyRoutineViewBinding.dailyRoutineConstraintLay.visibility = View.GONE
            educationViewBinding.educationConstraint.visibility = View.GONE
            vocationalTrainingViewBinding.vocationTrainingConstraintLay.visibility = View.VISIBLE
            specialUnitChildrenViewBinding.specialUnitChildrenConstraintLay.visibility = View.GONE
            scrollViewTop()
        }



        cciInspectionInstituationFormBinding.dateOfVisitEditText.setOnClickListener {
            pickDateCalendar(it)
        }

        cciInspectionInstituationFormBinding.dateOfRegistrationEditText.setOnClickListener {
            pickDateCalendar(it)
        }

    }

    override fun onDestroy() {
        super.onDestroy()
    }

    fun scrollViewTop(){
        //activityCciInspectionFormBinding.mainScrollView.pageScroll(View.FOCUS_UP)
        activityCciInspectionFormBinding.mainScrollView.postDelayed({
            activityCciInspectionFormBinding.mainScrollView.fullScroll(View.FOCUS_UP)
        },100)

    }

    fun pickDateCalendar( view: View){
        val materialDatePickerDialog = MaterialDatePicker.Builder.datePicker()
         val picker = materialDatePickerDialog.build()
        picker.show(activity?.supportFragmentManager!!,"datePicker")

        picker.addOnPositiveButtonClickListener {
            val dateString: String = DateFormat.format("MM/dd/yyyy", Date(it)).toString()

            (view as TextInputEditText).setText(dateString)
        }
    }
}