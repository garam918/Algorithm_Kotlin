package Programmers.Level2

fun main() {
    println(solution(intArrayOf(6, 10, 2)))
}

private fun solution(numbers: IntArray): String {
    var answer = ""

    val tempArray = ArrayList<String>()
    numbers.forEach {
        tempArray.add(it.toString())
    }

    tempArray.sortWith { o1, o2 ->
        when (o1.length) {
            o2.length -> o2.compareTo(o1)
            else -> (o2 + o1).compareTo(o1 + o2)
        }
    }

    if(tempArray.first() == "0") answer = "0"
    else tempArray.forEach { answer += it }

    return answer
}