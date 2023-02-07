package BOJ.Greedy

fun main() {

    val n = readln().toInt()
    val list = mutableListOf<Info>()

    var currentEnd = 0
    val answerList = mutableListOf<Info>()

    repeat(n) {
        val (start,end) = readln().split(" ").map { it.toInt() }
        list.add(Info(start,end))
    }

    list.sortedWith(compareBy ({ it.end } , {it.start})).forEach {
        if(currentEnd <= it.start) {
            currentEnd = it.end
            answerList.add(it)
        }
    }
    println(answerList.size)
}

data class Info(val start: Int, val end: Int)