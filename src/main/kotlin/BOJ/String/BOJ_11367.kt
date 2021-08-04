package BOJ.String

fun main () = repeat(readLine()!!.toInt()) {
    val s = readLine()!!.toString().split(" ")
    val name = s[0]

    when(s[1].toInt()) {
        in 97 .. 100 -> println("$name A+")
        in 90 .. 96 -> println("$name A")
        in 87 .. 89 -> println("$name B+")
        in 80 .. 86 -> println("$name B")
        in 77 .. 79 -> println("$name C+")
        in 70 .. 76 -> println("$name C")
        in 67 .. 69 -> println("$name D+")
        in 60 .. 66 -> println("$name D")
        in 0 .. 59 -> println("$name F")
    }
}