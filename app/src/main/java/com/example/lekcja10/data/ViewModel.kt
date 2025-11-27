package com.example.lekcja10.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.String

class AppViewModel: ViewModel() {
    private val _mealList = MutableLiveData<MutableList<Meal>>()
    val mealList: LiveData<MutableList<Meal>> get() = _mealList

    private val _currentMeal = MutableLiveData<Meal>()
    val currentMeal: LiveData<Meal> get() = _currentMeal

    private val _currentStep = MutableLiveData<ItemType>(ItemType.SOUP)
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

    fun clearMeals() {
        _mealList.value.clear()
    }
}