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
                image = R.drawable.ogorkowa
            ),
            Item(
                name = "Żurek",
                description = "Tydzień fermentował w szafce",
                type = ItemType.SOUP,
                price = 16.73,
                image = R.drawable.zurek
            ),
            Item(
                name = "Grochowa",
                description = "Aż łyżka staje(i nie tylko)",
                type = ItemType.SOUP,
                price = 16.73,
                image = R.drawable.grochowka
            ),
            Item(
                name = "Krokiety",
                description = "Mały a cieszy",
                type = ItemType.MEAL,
                price = 16.73,
                image = R.drawable.krokiety
            ),
            Item(
                name = "Spaghetti",
                description = "Włochy z ciasta",
                type = ItemType.MEAL,
                price = 16.73,
                image = R.drawable.spaghetti
            ),
            Item(
                name = "Żeberka",
                description = "Mięso same odchodzi",
                type = ItemType.MEAL,
                price = 16.73,
                image = R.drawable.zeberka
            ),
            Item(
                name = "Panierowane Filety Śledziowe",
                description = "Schabowy wikingów",
                type = ItemType.MEAL,
                price = 16.73,
                image = R.drawable.sledz
            ),
            Item(
                name = "Pierogi",
                description = "Każdy lubi najpierw wylizać pieroga",
                type = ItemType.MEAL,
                price = 16.73,
                image = R.drawable.pierog
            ),
            Item(
                name = "Gołąbki",
                description = "Uważaj bo odfruną",
                type = ItemType.MEAL,
                price = 16.73,
                image = R.drawable.golobki
            ),
            Item(
                name = "Kluski Śląskie",
                description = "Nie chodzi o dziołchy",
                type = ItemType.MEAL,
                price = 16.73,
                image = R.drawable.kluski
            ),
            Item(
                name = "Woda",
                description = "Ognista",
                type = ItemType.DRINK,
                price = 16.73,
                image = R.drawable.woda
            ),
            Item(
                name = "Cola",
                description = "E-Coli",
                type = ItemType.DRINK,
                price = 16.73,
                image = R.drawable.cola
            ),
            Item(
                name = "Mleko",
                description = "Prosto z cysia",
                type = ItemType.DRINK,
                price = 16.73,
                image = R.drawable.mleko
            ),
            Item(
                name = "Mielony",
                description = "Lepiony stopami",
                type = ItemType.MEAL,
                price = 16.73,
                image = R.drawable.mielony
            ),
            Item(
                name = "Bigos",
                description = "Grzyby podejrzane, a kapuste kisił jeszcze Jan Soplica",
                type = ItemType.MEAL,
                price = 16.73,
                image = R.drawable.bigos
            ),
            Item(
                name = "Pieczeń Rzymska",
                description = "Legionista ze stosu",
                type = ItemType.MEAL,
                price = 16.73,
                image = R.drawable.pieczen
            ),
            Item(
                name = "Kopytka",
                description = "Ktoś nie był tak głodny, żeby zjeść konia z kopytami",
                type = ItemType.MEAL,
                price = 16.73,
                image = R.drawable.kopytka
            ),
        )
    }
}