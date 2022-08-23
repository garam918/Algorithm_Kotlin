package BOJ.Math

fun main() {

    val n = readln().toInt()
    var count = 0

    readln().split(" ").forEach {
        if(isPrime(it)) count++
    }

    println(count)
}

private fun isPrime(num : String) : Boolean {
    var isPrime = true

    if(num.toInt() <= 1) isPrime = false
    else {
        for (i in 2 until num.toInt()) {
            if (num.toInt() % i == 0) {
                isPrime = false
                break
            }
        }
    }

    return isPrime
}