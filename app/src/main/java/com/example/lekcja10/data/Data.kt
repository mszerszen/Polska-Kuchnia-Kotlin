package com.example.lekcja10.data

import com.example.lekcja10.R

class Data {
    companion object {
        val Data = listOf<MenuItem>(
            MenuItem(
                name = "Pomidorowa",
                description = "Z rosołu z wczoraj",
                type = ItemType.SOUP,
                price = 15.0,
                image = R.drawable.pomidorowa
            ),
            MenuItem(
                name = "Rosół",
                description = "Z wczoraj",
                type = ItemType.SOUP,
                price = 12.30,
                image = R.drawable.rosol
            ),
            MenuItem(
                name = "Ogórkowa",
                description = "Sam kisiłem ogóra",
                type = ItemType.SOUP,
                price = 16.73,
                image = R.drawable.ogorkowa
            ),
            MenuItem(
                name = "Żurek",
                description = "Tydzień fermentował w szafce",
                type = ItemType.SOUP,
                price = 16.73,
                image = R.drawable.zurek
            ),
            MenuItem(
                name = "Grochowa",
                description = "Aż łyżka staje(i nie tylko)",
                type = ItemType.SOUP,
                price = 16.73,
                image = R.drawable.grochowka
            ),
            MenuItem(
                name = "Krokiety",
                description = "Mały a cieszy",
                type = ItemType.MEAL,
                price = 16.73,
                image = R.drawable.krokiety
            ),
            MenuItem(
                name = "Spaghetti",
                description = "Włochy z ciasta",
                type = ItemType.MEAL,
                price = 16.73,
                image = R.drawable.spaghetti
            ),
            MenuItem(
                name = "Żeberka",
                description = "Mięso same odchodzi",
                type = ItemType.MEAL,
                price = 16.73,
                image = R.drawable.zeberka
            ),
            MenuItem(
                name = "Panierowane Filety Śledziowe",
                description = "Schabowy wikingów",
                type = ItemType.MEAL,
                price = 16.73,
                image = R.drawable.sledz
            ),
            MenuItem(
                name = "Pierogi",
                description = "Każdy lubi najpierw wylizać pieroga",
                type = ItemType.MEAL,
                price = 16.73,
                image = R.drawable.pierog
            ),
            MenuItem(
                name = "Gołąbki",
                description = "Uważaj bo odfruną",
                type = ItemType.MEAL,
                price = 16.73,
                image = R.drawable.golobki
            ),
            MenuItem(
                name = "Kluski Śląskie",
                description = "Nie chodzi o dziołchy",
                type = ItemType.MEAL,
                price = 16.73,
                image = R.drawable.kluski
            ),
            MenuItem(
                name = "Woda",
                description = "Ognista",
                type = ItemType.DRINK,
                price = 16.73,
                image = R.drawable.woda
            ),
            MenuItem(
                name = "Cola",
                description = "E-Coli",
                type = ItemType.DRINK,
                price = 16.73,
                image = R.drawable.cola
            ),
            MenuItem(
                name = "Mleko",
                description = "Prosto z cysia",
                type = ItemType.DRINK,
                price = 16.73,
                image = R.drawable.mleko
            ),
            MenuItem(
                name = "Mielony",
                description = "Lepiony stopami",
                type = ItemType.MEAL,
                price = 16.73,
                image = R.drawable.mielony
            ),
            MenuItem(
                name = "Bigos",
                description = "Grzyby podejrzane, a kapuste kisił jeszcze Jan Soplica",
                type = ItemType.MEAL,
                price = 16.73,
                image = R.drawable.bigos
            ),
            MenuItem(
                name = "Pieczeń Rzymska",
                description = "Legionista ze stosu",
                type = ItemType.MEAL,
                price = 16.73,
                image = R.drawable.pieczen
            ),
            MenuItem(
                name = "Kopytka",
                description = "Ktoś nie był tak głodny, żeby zjeść konia z kopytami",
                type = ItemType.MEAL,
                price = 16.73,
                image = R.drawable.kopytka
            ),
        )
    }
}