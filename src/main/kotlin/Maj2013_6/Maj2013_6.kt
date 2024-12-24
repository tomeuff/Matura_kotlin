package Maj2013_6

import java.io.File

fun main(args: Array<String>)
{
    var plik = File("C:\\Users\\TK\\IdeaProjects\\Matury_kotlin\\src\\main\\kotlin\\Maj2013_6\\dane.txt")
    var dane = plik.readLines()
    var wynik = File("C:\\Users\\TK\\IdeaProjects\\Matury_kotlin\\src\\main\\kotlin\\Maj2013_6\\wyniki6.txt")
    wynik.writeText("")

    //a)
    wynik.appendText("a)\n${dane.filter({it.first() == it.last()}).size}\n")

    //b)
    wynik.appendText("b)\n${dane.filter({it.toInt(8).toString().first() == 
            it.toInt(8).toString().last()}).size}\n")

    //c)
    var rosnace = dane.filter({it == it.toList().sorted().joinToString("")}).map({it.toInt()})
    wynik.appendText("c)\n${rosnace.size}\n${rosnace.max()}\n${rosnace.min()}\n")
}