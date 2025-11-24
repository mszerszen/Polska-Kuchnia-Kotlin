package com.example.lekcja10.data

data class Meal(
    val name: String,
    val soup: Meal?,
    val second: Meal?,
    val drink: Meal?
)

data class MenuItem(
    val name: String,
    val description: String?,
    val type: ItemType,
    val price: Double,
    val image: Int?
)

enum class ItemType {
    SOUP,
    MEAL,
    DRINK
}