package Programmers.Level3

fun main() {

    println(solution(arrayOf("I 7","I 5","I 7","I -5","D 1","I -5")).toList())
}

fun solution(operations: Array<String>): IntArray {
    var answer = intArrayOf()

    val list = mutableListOf<Int>()

    operations.forEachIndexed { index, s ->
        val op = s.split(" ")

        when(op[0]) {
            "I" -> {
                list.add(op[1].toInt())
            }

            "D" -> {
                if(op[1] == "1") {
                    if(list.isNotEmpty()) list.remove(list.maxOrNull())
                }
                else {
                    if(list.isNotEmpty()) list.remove(list.minOrNull())
                }

            }

        }
    }

    answer += if (list.isEmpty()) intArrayOf(0,0)
    else intArrayOf(list.maxOrNull()!!,list.minOrNull()!!)

    return answer
}