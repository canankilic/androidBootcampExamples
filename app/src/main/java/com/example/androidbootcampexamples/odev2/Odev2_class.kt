package com.example.androidbootcampexamples.odev2

class Odev2_class {
    fun fahrenheitTransform(): Double {
        val celcius = 15
        val fahren = celcius * 1.8 + 32
        return fahren
    }

    fun dikdortgenCevre(): Int {
        val kisaKenar = 5
        val uzunKenar = 10
        val cevre = (kisaKenar + uzunKenar) * 2
        return cevre
    }

    fun faktoriyel(): Int {
        var num = 3
        var fakt = 0
        while(num > 0){
            fakt = num + fakt
            num--
        }
        return fakt
    }

    fun aHarfSayisi(): Int {
        val kelime = "araba"
        var sayac = 0

        for (harf in kelime) {
            if (harf == 'a') {
                sayac = sayac + 1
            }
        }
        return sayac
    }

    fun icAcilar(): Int {
        val kenarSayisi = 3
        val icAciToplami = (kenarSayisi - 2) * 180
        return icAciToplami
    }

    fun maasHesapla(gunSayisi: Int): Int {
        val saatlikUcret = 10
        val mesaiUcreti = 20
        val normalCalismaSaati = 8

        val toplamSaat = gunSayisi * normalCalismaSaati

        var maas = 0

        if (toplamSaat <= 160) {
            maas = toplamSaat * saatlikUcret
        } else {
            val mesaiSaati = toplamSaat - 160
            maas = (160 * saatlikUcret) + (mesaiSaati * mesaiUcreti)
        }
        return maas
    }

    fun kotaUcretiHesapla(kota: Int): Int {
        val sabitUcret = 100
        val kotaSiniri = 50
        val asimUcreti = 4

        var toplamUcret = 0

        if (kota <= kotaSiniri) {
            toplamUcret = sabitUcret
        } else {
            val asimMiktari = kota - kotaSiniri
            toplamUcret = sabitUcret + (asimMiktari * asimUcreti)
        }

        return toplamUcret
    }
}