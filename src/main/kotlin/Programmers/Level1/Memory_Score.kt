package Programmers.Level1

fun main() {

    val nameArray = arrayOf("may", "kein", "kain", "radi")
    val yearningArray = intArrayOf(5, 10, 1, 3)
    val photoArray = arrayOf(arrayOf("may", "kein", "kain", "radi"), arrayOf("may", "kein", "brin", "deny"),
        arrayOf("kon", "kain", "may", "coni"))


    solution(nameArray, yearningArray ,photoArray)

}

private fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
    val answer = IntArray(photo.size)

    val scoreMap = mutableMapOf<String,Int>()

    name.forEachIndexed { index, s ->
        scoreMap[s] = yearning[index]
    }

    photo.forEachIndexed { index, array ->
        var score = 0
        array.forEach { key ->
            score += scoreMap.getOrDefault(key,0)
        }
        answer[index] = score

        println("$index $score")

    }

    return answer
}