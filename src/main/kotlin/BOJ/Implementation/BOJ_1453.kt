package BOJ.Implementation

fun main() {
    var answer = 0
    val n = readLine()!!.toInt()
    val s = readLine()!!.toString().split(" ")

    val list = MutableList(n) { 0 }

    repeat(n) {
        if(!list.contains(s[it].toInt())) list[it] = s[it].toInt()
        else answer++
    }
    println(answer)
}