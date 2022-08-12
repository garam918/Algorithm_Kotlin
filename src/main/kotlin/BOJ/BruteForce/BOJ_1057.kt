package BOJ.BruteForce

fun main() {

    val (n,a,b) = readln().split(" ").map { it.toInt() }

    var currentA = a
    var currentB = b

    var answer = 0

    while (currentA != currentB) {
        if(currentA % 2 == 1) currentA = (currentA / 2) + 1
        else currentA /= 2

        if(currentB % 2 == 1) currentB = (currentB / 2) + 1
        else currentB /= 2

        answer++
    }

    println(answer)
}