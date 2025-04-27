package com.example.androidbootcampexamples.odev2

fun main() {
    val odev2 = Odev2_class()

    val fahrenheitSonuc = odev2.fahrenheitTransform()
    println("Fahrenheit dönüşüm sonucu: $fahrenheitSonuc")

    val dikdortgenSonuc = odev2.dikdortgenCevre()
    println("Dikdörtgen çevresi: $dikdortgenSonuc")

    val faktoriyelSonuc = odev2.faktoriyel()
    println("Faktöriyel sonucu: $faktoriyelSonuc")

    val aHarfSayisiSonuc = odev2.aHarfSayisi()
    println("Kelimedeki 'a' harfi sayısı: $aHarfSayisiSonuc")

    val icAciSonuc = odev2.icAcilar()
    println("İç açılar toplamı: $icAciSonuc")

    val maasSonuc = odev2.maasHesapla(22)
    println("Maaş hesaplama sonucu: $maasSonuc TL")

    val kotaSonuc = odev2.kotaUcretiHesapla(60)
    println("Kota ücreti hesaplama sonucu: $kotaSonuc TL")
}
