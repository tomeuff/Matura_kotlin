package Maj2011_6

import java.io.File

fun main(args: Array<String>)
{
    var plik = File("C:\\Users\\TK\\IdeaProjects\\Matury_kotlin\\src\\main\\kotlin\\Maj2011_6\\liczby.txt")
    var dane = plik.readLines()
    var wynik = File("C:\\Users\\TK\\IdeaProjects\\Matury_kotlin\\src\\main\\kotlin\\Maj2011_6\\zadanie6.txt")
    wynik.writeText("")

    //a)
    wynik.appendText("a)\n${dane.map({if(it.last() == '0') 1 else 0}).sum()}\n")

    //b)
    var max_dec = dane.map({it -> it.toInt(2)}).max()
    var max_bin = max_dec.toString(2)
    wynik.appendText("b)\n${max_bin}\n${max_dec}\n")

    //c)
    var bin_9_cyfr = dane.filter({it.length == 9})
    wynik.appendText("c)\n${bin_9_cyfr.size}\n${bin_9_cyfr.map({it.toInt(2)}).sum().toString(2)}")
}