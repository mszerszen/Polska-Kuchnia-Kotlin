package com.example.lekcja10.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.String

class AppViewModel: ViewModel() {
    private var _mealList = MutableLiveData<MutableList<Meal>>(
        mutableListOf()
    )
    val mealList: LiveData<MutableList<Meal>> get() = _mealList

    private var _currentMeal = MutableLiveData<Meal>(
        Meal(
            name = "",
            soup = null,
            second = null,
            drink = null
        )
    )
    val currentMeal: LiveData<Meal> get() = _currentMeal

    private var _currentStep = MutableLiveData<ItemType>(ItemType.SOUP)
    val currentStep: LiveData<ItemType> get() = _currentStep

    fun addMeal() {
        _mealList.value.add(
            Meal(
                name = _currentMeal.value.name,
                soup = _currentMeal.value.soup,
                second = _currentMeal.value.second,
                drink = _currentMeal.value.drink
            )
        )
        _currentMeal.value = Meal(
            name = "",
            soup = null,
            second = null,
            drink = null
        )

        _currentStep.value = ItemType.SOUP
    }

    fun setCurrentMealData(menuItem: MenuItem, type: ItemType) {
        if(type == ItemType.SOUP) {
            _currentMeal.value.soup = menuItem
        } else if (type == ItemType.MEAL) {
            _currentMeal.value.second = menuItem
        } else {
            _currentMeal.value.drink = menuItem
        }
    }

    fun setCurrentStep(step: ItemType) {
        _currentStep.value = step
    }

    fun setCurrentMealName(name: String) {
        _currentMeal.value.name = name
    }
}