package Przykladowa2015_4

import java.io.File

fun main(args: Array<String>) {
    var plik = File("C:\\Users\\TK\\IdeaProjects\\Matury_kotlin\\src\\main\\kotlin\\Przykladowa2015_4\\dane_anagramy.txt")
    var dane = plik.readLines().map({it.split(" ")})
    var wynik = File("C:\\Users\\TK\\IdeaProjects\\Matury_kotlin\\src\\main\\kotlin\\Przykladowa2015_4\\wyniki_anagramy.txt")
    wynik.writeText("")

    //a)
    wynik.appendText("a)\n${dane.filter({it[0].toList().sorted().equals(it[1].toList().sorted())}).size}\n")

    //b)
    var dane2 = plik.readLines().joinToString(" ").split(" ")
    wynik.appendText("b)\n${dane2.map({d ->dane2.filter({it.toList().sorted().equals(d.toList().sorted())}).size}).max
        ()}\n")
}