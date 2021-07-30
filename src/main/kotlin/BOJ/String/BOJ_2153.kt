package BOJ.String

fun main() {
    var num = 0
    readLine()!!.toString().onEachIndexed { index, c ->
        when {
            c.isUpperCase() -> num += (c.toInt() - 38)
            c.isLowerCase() -> num += (c.toInt() - 96)
        }
    }
    if(isPrime(num)) println("It is a prime word.")
    else println("It is not a prime word.")
}

private fun isPrime(num : Int) : Boolean{
    for(i in 2 until num) {
        if(num % i == 0) return false
    }

    return true
}