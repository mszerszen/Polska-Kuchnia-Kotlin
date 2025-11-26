package com.example.lekcja10.data

data class Meal(
    var name: String,
    var soup: MenuItem?,
    var second: MenuItem?,
    var drink: MenuItem?
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