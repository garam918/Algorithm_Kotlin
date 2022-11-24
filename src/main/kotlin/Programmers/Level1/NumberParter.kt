package Programmers.Level1

fun main() = println(solution("100","123450"))

private fun solution(X: String, Y: String): String {
    var answer = ""

    var xMap = mutableMapOf<Char,Int>()
    var yMap = mutableMapOf<Char,Int>()

    X.forEach {
        if(xMap.containsKey(it)) xMap[it] = xMap[it]!! + 1
        else xMap[it] = 1
    }

    Y.forEach {
        if(yMap.containsKey(it)) yMap[it] = yMap[it]!! + 1
        else yMap[it] = 1
    }

    xMap = xMap.toList().sortedByDescending { it.first }.toMap() as MutableMap
    yMap = yMap.toList().sortedByDescending { it.first }.toMap() as MutableMap

    xMap.forEach { (key, xNum) ->
        if(yMap.containsKey(key)) {
            val yNum = yMap[key]!!

            answer += if (xNum > yNum) key.toString().repeat(yNum)
            else key.toString().repeat(xNum)
        }
    }

    if(answer.isBlank()) answer = "-1"
    else if(answer.first() == '0') answer = "0"

    return answer
}