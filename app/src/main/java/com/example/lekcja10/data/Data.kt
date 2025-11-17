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
            ),
            Item(
                name = "Rosół",
                description = "Z wczoraj",
                type = ItemType.SOUP,
                price = 12.30,
                image = R.drawable.rosol
            ),
            Item(
                name = "Ogórkowa",
                description = "Sam kisiłem ogóra",
                type = ItemType.SOUP,
                price = 16.73,
                image = R.drawable.pomidorowa
            ),
            
        )
    }
}