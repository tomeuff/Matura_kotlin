package Maj2010_4

import java.io.File

fun main(args: Array<String>) {
    var plik = File("C:\\Users\\TK\\IdeaProjects\\Matury_kotlin\\src\\main\\kotlin\\Maj2010_4\\anagram.txt")
    var dane = plik.readLines()

    var wynik_a = File("C:\\Users\\TK\\IdeaProjects\\Matury_kotlin\\src\\main\\kotlin\\Maj2010_4\\odp_4a.txt")
    var wynik_b = File("C:\\Users\\TK\\IdeaProjects\\Matury_kotlin\\src\\main\\kotlin\\Maj2010_4\\odp_4b.txt")

    //Zadanie 4. a) i b)
    wynik_a.writeText("")
    wynik_b.writeText("")
    for(w in dane)
    {
        if(w.split(" ").map({it.length}).toSet().size == 1)
            wynik_a.appendText("${w}\n")
        if(w.split(" ").map({it.toList().sorted().joinToString("")}).toSet().size == 1)
            wynik_b.appendText("${w}\n")
    }
}