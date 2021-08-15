package BOJ.Implementation

fun main() = repeat(readLine()!!.toInt()) {
    val n = readLine()!!.toInt()

    val list = MutableList(n) { false }

    for(i in 1 .. n) {
        list.forEachIndexed { index, b ->
            if((index + 1) % i == 0) {
                list[index] = !b
            }
        }
    }
    var answer = 0
    list.forEachIndexed { index, b ->
        if(b) answer++
    }

    println(answer)
}