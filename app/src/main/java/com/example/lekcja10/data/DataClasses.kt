package com.example.lekcja10.data

data class Item(
    val name: String,
    val description: String,
    val type: ItemType,
    val price: Double,
    val image: Int
)

enum class ItemType {
    SOUP,
    MEAL,
    DRINK
}