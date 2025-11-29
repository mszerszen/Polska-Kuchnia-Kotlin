package com.example.lekcja10.data

import com.example.lekcja10.R

class Data {
    companion object {
        val Data = listOf<MenuItem>(
            MenuItem(
                name = "Pomidorowa",
                description = "Z rosołu z wczoraj. Jola Meller robiła. Nawet na obrazku jest",
                type = ItemType.SOUP,
                price = 6.50,
                image = R.drawable.pomidorowa
            ),
            MenuItem(
                name = "Rosół",
                description = "Z wczoraj",
                type = ItemType.SOUP,
                price = 8.30,
                image = R.drawable.rosol
            ),
            MenuItem(
                name = "Ogórkowa",
                description = "Sam kisiłem ogóra",
                type = ItemType.SOUP,
                price = 20.47,
                image = R.drawable.ogorkowa
            ),
            MenuItem(
                name = "Żurek",
                description = "Tydzień fermentował w szafce",
                type = ItemType.SOUP,
                price = 12.90,
                image = R.drawable.zurek
            ),
            MenuItem(
                name = "Grochowa",
                description = "Aż łyżka staje(i nie tylko)",
                type = ItemType.SOUP,
                price = 20.10,
                image = R.drawable.grochowka
            ),
            MenuItem(
                name = "Krokiety",
                description = "Mały a cieszy",
                type = ItemType.MEAL,
                price = 14.21,
                image = R.drawable.krokiety
            ),
            MenuItem(
                name = "Spaghetti",
                description = "Włochy z ciasta. \nA Kornel miał jedno zadanie, pilnować cebule. Robiłem spaghetti. Musiałem do toalety pilnie. \nwiktor-Kornel, popilnujesz cebuli? \nkornel-Tak \nwiktor-dasz rade? \nkornel-Dam rade \nwiktor-Tylko jej nie spal . \nIde do toalety i po chwili słysze krzyk kornela- Wiiiiiktooooooor, bo cebula jest czarna!!",
                type = ItemType.MEAL,
                price = 30.70,
                image = R.drawable.spaghetti
            ),
            MenuItem(
                name = "Żeberka",
                description = "Mięso same odchodzi",
                type = ItemType.MEAL,
                price = 37.45,
                image = R.drawable.zeberka
            ),
            MenuItem(
                name = "Panierowane Filety Śledziowe",
                description = "Schabowy wikingów",
                type = ItemType.MEAL,
                price = 28.75,
                image = R.drawable.sledz
            ),
            MenuItem(
                name = "Pierogi",
                description = "Każdy lubi najpierw wylizać pieroga",
                type = ItemType.MEAL,
                price = 22.99,
                image = R.drawable.pierog
            ),
            MenuItem(
                name = "Gołąbki",
                description = "Uważaj bo odfruną",
                type = ItemType.MEAL,
                price = 29.50,
                image = R.drawable.golobki
            ),
            MenuItem(
                name = "Kluski Śląskie",
                description = "Nie chodzi o dziołchy",
                type = ItemType.MEAL,
                price = 21.30,
                image = R.drawable.kluski
            ),
            MenuItem(
                name = "Woda",
                description = "Ognista",
                type = ItemType.DRINK,
                price = 7.20,
                image = R.drawable.woda
            ),
            MenuItem(
                name = "Cola",
                description = "E-Coli",
                type = ItemType.DRINK,
                price = 7.20,
                image = R.drawable.cola
            ),
            MenuItem(
                name = "Mleko",
                description = "Prosto z cysia",
                type = ItemType.DRINK,
                price = 15.00,
                image = R.drawable.mleko
            ),
            MenuItem(
                name = "Mielony",
                description = "Lepiony stopami",
                type = ItemType.MEAL,
                price = 24.15,
                image = R.drawable.mielony
            ),
            MenuItem(
                name = "Bigos",
                description = "Grzyby podejrzane, a kapuste kisił jeszcze Jan Soplica",
                type = ItemType.MEAL,
                price = 23.40,
                image = R.drawable.bigos
            ),
            MenuItem(
                name = "Pieczeń Rzymska",
                description = "Legionista ze stosu",
                type = ItemType.MEAL,
                price = 29.15,
                image = R.drawable.pieczen
            ),
            MenuItem(
                name = "Kopytka",
                description = "Ktoś nie był tak głodny, żeby zjeść konia z kopytami",
                type = ItemType.MEAL,
                price = 23.40,
                image = R.drawable.kopytka
            ),
            MenuItem(
                name = "Placki Ziemniaczane",
                description = "Nie pomyl z krowim",
                type = ItemType.MEAL,
                price = 23.80,
                image = R.drawable.plackiziem
            ),
            MenuItem(
                name = "Naleśniki",
                description = "Mąka, woda, mleko, cukier. A Kornel nie umie zrobić",
                type = ItemType.MEAL,
                price = 19.80,
                image = R.drawable.images
            ),
            MenuItem(
                name = "Barszcz Z Uszkami",
                description = "Jak sobie ucho poparzyłem żelazkiem to wyglądało jak barszcz czerwony z uszkiem",
                type = ItemType.SOUP,
                price = 21.50,
                image = R.drawable.barszcz
            ),
            MenuItem(
                name = "Os(Mikro)cypek",
                description = "Taki ser co śmierdzi stopą górala. A oni sie spocą w tych górach",
                type = ItemType.MEAL,
                price = 65.00,
                image = R.drawable.oscypek
            ),
            MenuItem(
                name = "Kapuśniak",
                description = "Bigos zalany wrzątkiem",
                type = ItemType.SOUP,
                price = 17.65,
                image = R.drawable.kwasnica
            ),
            MenuItem(
                name = "Flaczki",
                description = "Fuj",
                type = ItemType.SOUP,
                price = 23.40,
                image = R.drawable.flaczki
            ),
            MenuItem(
                name = "Grzybowa",
                description = "Stary moczył nogi w misce",
                type = ItemType.SOUP,
                price = 24.90,
                image = R.drawable.grzybowa
            ),
            MenuItem(
                name = "Kompot",
                description = "Cum pot",
                type = ItemType.DRINK,
                price = 9.45,
                image = R.drawable.cum
            ),
            MenuItem(
                name = "Piwo",
                description = "Piwko Jakub",
                type = ItemType.DRINK,
                price = 9.56,
                image = R.drawable.piwko
            ),
            MenuItem(
                name = "Wódka Czysta",
                description = "Spiryt ze spirytem",
                type = ItemType.DRINK,
                price = 32.50,
                image = R.drawable.czysta
            ),
            MenuItem(
                name = "Wódka Kolorowa",
                description = "Spiryt z barwnikiem",
                type = ItemType.DRINK,
                price = 16.73,
                image = R.drawable.kolorowa
            ),
            MenuItem(
                name = "Miód Pitny",
                description = "Napój szlachcica",
                type = ItemType.DRINK,
                price = 16.73,
                image = R.drawable.miod
            ),
            MenuItem(
                name = "Karp W Galarecie",
                description = "Ryba co smakuje błotem w galarecie co nie smakuje niczym",
                type = ItemType.MEAL,
                price = 16.73,
                image = R.drawable.kapr
            ),
            MenuItem(
                name = "Moczka",
                description = "Nie wiem co to, wygląda jak gówno",
                type = ItemType.MEAL,
                price = 16.73,
                image = R.drawable.moczka
            ),
            MenuItem(
                name = "Siemieniotka",
                description = "Podejrzany biały płyn(sperma) z kaszą",
                type = ItemType.SOUP,
                price = 16.73,
                image = R.drawable.siem
            ),
            MenuItem(
                name = "Parzybroda",
                description = "Jakaś papka z kiełbasą",
                type = ItemType.MEAL,
                price = 16.73,
                image = R.drawable.parzybroda
            ),
            MenuItem(
                name = "Rybna",
                description = "Bul Bul Bul",
                type = ItemType.SOUP,
                price = 16.73,
                image = R.drawable.rybna
            ),
            MenuItem(
                name = "Kwas Chlebowy",
                description = "Nie smakuje jak chleb",
                type = ItemType.DRINK,
                price = 16.73,
                image = R.drawable.chleb
            ),
            MenuItem(
                name = "Kakao",
                description = "Tak biedna czekolada",
                type = ItemType.DRINK,
                price = 16.73,
                image = R.drawable.kako
            ),
            MenuItem(
                name = "Donut",
                description = "Pączek pączek nie ma rączek",
                type = ItemType.MEAL,
                price = 16.73,
                image = R.drawable.paczek
            ),
            MenuItem(
                name = "Tapas",
                description = "Przekąska, a może zakąska",
                type = ItemType.MEAL,
                price = 16.73,
                image = R.drawable.tapas
            ),
            MenuItem(
                name = "Śniadanie Po Brytyjsku",
                description = "Tost, fasola, jajko, bekon. All-in-One",
                type = ItemType.MEAL,
                price = 16.73,
                image = R.drawable.kanbre
            ),
            MenuItem(
                name = "Zestaw Dla Dziecka-Wege",
                description = "Niebieski kwiat i kolce",
                type = ItemType.MEAL,
                price = 16.73,
                image = R.drawable.shrek
            ),
            MenuItem(
                name = "Onion rings",
                description = "Smierdzisz potem jak Żydzi(czosnkiem i cebulą), ale dobre",
                type = ItemType.MEAL,
                price = 16.73,
                image = R.drawable.onnion
            ),
            MenuItem(
                name = "Banan",
                description = "Banany to tu do szkoły chodzą. Co drugi to banan.",
                type = ItemType.MEAL,
                price = 16.73,
                image = R.drawable.banan
            ),
        )
    }
}