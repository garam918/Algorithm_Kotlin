package BOJ.String

fun main() {
    val list : MutableList<Long> = mutableListOf()
    repeat(readLine()!!.toInt()) {
        val num = readLine()!!.toLong()
        if(num != 0.toLong()) list.add(num)
        else list.removeAt(list.lastIndex)
    }
    var answer : Long = 0

    list.onEachIndexed { index, i ->
        answer += i
    }
    println(answer)
}