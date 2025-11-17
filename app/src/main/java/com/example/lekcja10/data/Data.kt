package com.example.lekcja10.data

class Data {
    companion object {
        val Data = listOf<Item>(
            Item(
                name = "Nazwa",
                description = "Opis",
                type = ItemType.SOUP,
                price = 0.0,
                image = 0 // tutaj potem będzie coś w stylu R.id.drawable... ale to potem
            )
        )
    }
}