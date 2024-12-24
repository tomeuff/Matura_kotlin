package Maj2012_4

import java.io.File
import kotlin.math.ceil

fun main(args: Array<String>) {
    //a)
    var tj = File("C:\\Users\\TK\\IdeaProjects\\Matury_kotlin\\src\\main\\kotlin\\Maj2012_4\\tj.txt").readLines()
    var klucze1 = File("C:\\Users\\TK\\IdeaProjects\\Matury_kotlin\\src\\main\\kotlin\\Maj2012_4\\klucze1.txt").readLines()
    var wyniki_a = File("C:\\Users\\TK\\IdeaProjects\\Matury_kotlin\\src\\main\\kotlin\\Maj2012_4\\wynik4a.txt")
    wyniki_a.writeText("")

    for((t, k) in tj.zip(klucze1))
    {
        var kl = k.repeat(ceil(t.length.toDouble() / k.length).toInt())
        kl = kl.dropLast(kl.length - t.length)
        wyniki_a.appendText("${t.zip(kl).map({(t1, k1) -> if(t1.code + k1.code - 64 <= 90)
            t1.code + k1.code - 64 else t1.code + k1.code - 64 - 26}).map({it.toChar()}).joinToString("")}\n")
    }

    //b)
    var sz = File("C:\\Users\\TK\\IdeaProjects\\Matury_kotlin\\src\\main\\kotlin\\Maj2012_4\\sz.txt").readLines()
    var klucze2 = File("C:\\Users\\TK\\IdeaProjects\\Matury_kotlin\\src\\main\\kotlin\\Maj2012_4\\klucze2.txt")
        .readLines()
    var wyniki_b = File("C:\\Users\\TK\\IdeaProjects\\Matury_kotlin\\src\\main\\kotlin\\Maj2012_4\\wynik4b.txt")
    wyniki_b.writeText("")

    for((t, k) in sz.zip(klucze2))
    {
        var kl = k.repeat(ceil(t.length.toDouble() / k.length).toInt())
        kl = kl.dropLast(kl.length - t.length)
        wyniki_b.appendText("${t.zip(kl).map({(t1, k1) -> if(t1.code - k1.code + 64 >= 65)
            t1.code - k1.code + 64 else t1.code - k1.code + 64 + 26}).map({it.toChar()}).joinToString("")}\n")
    }
}