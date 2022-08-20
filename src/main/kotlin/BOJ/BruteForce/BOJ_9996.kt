package BOJ.BruteForce

fun main() {
    val n = readln().toInt()
    val pattern = readln()

    val (first, last) = pattern.split("*")

    val regex = "$first([a-z]*)$last".toRegex()

    repeat(n) {
        if(regex.matchEntire(readln()) != null) println("DA")
        else println("NE")
    }
}