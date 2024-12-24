package Maj2014_5

import java.io.File
import kotlin.math.sqrt

fun czy_pierwsza(liczba: Int): Boolean
{
    if(liczba == 1)
        return false
    for(d in 2..sqrt(liczba.toDouble()).toInt())
        if(liczba % d == 0)
            return false
    return true
}

fun main(args: Array<String>) {
    var plik = File("C:\\Users\\TK\\IdeaProjects\\Matury_kotlin\\src\\main\\kotlin\\Maj2014_5\\NAPIS.TXT")
    var dane = plik.readLines()
    var wynik = File("C:\\Users\\TK\\IdeaProjects\\Matury_kotlin\\src\\main\\kotlin\\Maj2014_5\\ZADANIE5.TXT")
    wynik.writeText("")

    //a)
    wynik.appendText("a)\n${dane.filter({czy_pierwsza(it.toList().map({it.code}).sum())}).size}\n")

    //b)
    wynik.appendText("b)\n")
    for(t in dane)
    {
        var czy_ok = true
        for(i in 1..t.length - 1)
            if(t[i] <= t[i - 1])
                czy_ok = false
        if(czy_ok)
            wynik.appendText("$t\n")
    }

    //c)
    wynik.appendText("c)\n")
    var zbior = dane.toSet()
    for(t in zbior)
        if(dane.count({it == t}) > 1)
            wynik.appendText("$t\n")
}