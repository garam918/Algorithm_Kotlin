package BOJ.Implementation

fun main() {

    val n = readln().toInt()
    val set = mutableSetOf<String>()

    repeat(n) { set.add(readln()) }

    val size = set.size
    val temp = mutableSetOf<String>()
    var answer = 0
    val length = set.first().length

    for (i in 1 .. length) {
        temp.clear()
        set.forEach { temp.add(it.drop(length-i)) }
        if(size == temp.size) {
            answer = i
            break
        }
    }

    println(answer)
}