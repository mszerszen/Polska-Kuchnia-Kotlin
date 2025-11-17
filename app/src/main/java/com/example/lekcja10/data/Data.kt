package com.example.lekcja10.data

import com.example.lekcja10.R

class Data {
    companion object {
        val Data = listOf<Item>(
            Item(
                name = "Pomidorowa",
                description = "Z rosołu z wczoraj",
                type = ItemType.SOUP,
                price = 15.0,
                image = R.drawable.pomidorowa
            )
        )
    }
}