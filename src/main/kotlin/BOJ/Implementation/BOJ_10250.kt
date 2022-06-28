package BOJ.Implementation

fun main() = repeat(readLine()!!.toInt()) {

    val hwn = readLine()!!.split(" ")
    val h = hwn[0].toInt()
    val w = hwn[1].toInt()
    val n = hwn[2].toInt()

    var answer = ""

    var last = if(1 + (n / h) < 10) "0${1 + (n / h)}"
    else "${1 + (n / h)}"

    answer = if(n % h == 0) {
        if(n / h >= 10) "$h${n / h}"
        else "${h}0${n / h}"
    }
    else "${n % h}$last"

    println(answer)

}