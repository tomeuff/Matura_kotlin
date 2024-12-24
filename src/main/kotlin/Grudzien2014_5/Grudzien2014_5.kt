package Grudzien2014_5

import java.io.File

fun main(args: Array<String>) {
    var plik = File("C:\\Users\\TK\\IdeaProjects\\Matury_kotlin\\src\\main\\kotlin\\Grudzien2014_5\\dziennik.txt")
    var dane = plik.readLines().map({it.toInt()})
    var wynik = File("C:\\Users\\TK\\IdeaProjects\\Matury_kotlin\\src\\main\\kotlin\\Grudzien2014_5\\wyniki5.txt")
    wynik.writeText("")

    //Zadanie 5.1.
    var p = 0
    var k = 0
    var p_max = 0
    var k_max = 0
    var ile_ponad_3 = 0
    for(i in 1..dane.size - 1)
    {
        if(dane[i] > dane[i - 1])
            k++
        else
        {
            if(k - p + 1 > 3)
                ile_ponad_3++

            if(k - p + 1 > k_max - p_max + 1)
            {
                k_max = k
                p_max = p
            }

            p = i
            k = i
        }
    }

    if(k - p + 1 > 3)
        ile_ponad_3++

    if(k - p + 1 > k_max - p_max + 1)
    {
        k_max = k
        p_max = p
    }

    wynik.appendText("5.1.\n${ile_ponad_3}\n\n")

    //Zadanie 5.2.
    wynik.appendText("5.2.\n${dane.max()}, ${dane.indexOf(dane.max()) + 1}\n${dane.min()}, " +
            "${dane.indexOf(dane.min()) + 1}\n\n")

    //Zadanie 5.3.
    wynik.appendText("5.3.\n${k_max - p_max + 1}, ${dane[k_max] - dane[p_max]}\n")
}