package com.example.lekcja10.data.manager

import android.content.Context
import com.google.gson.Gson

class SharedPrefsManager(context: Context) {
    private val sharedPreferences = context.getSharedPreferences("app_prefs", Context.MODE_PRIVATE)
    private val gson = Gson()

    fun save
}