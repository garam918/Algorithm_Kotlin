package BOJ.Implementation

fun main() {
    val mon = readLine()!!.toInt()
    val day = readLine()!!.toInt()

    when(mon) {
        1 -> println("Before")
        2 -> {
            when(day) {
                in 1 .. 17 -> println("Before")
                18 -> println("Special")
                else -> println("After")
            }
        }
        else -> println("After")
    }
}