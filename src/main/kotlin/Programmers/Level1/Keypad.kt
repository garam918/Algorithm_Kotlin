package Programmers.Level1

fun main() = println(solution(arrayOf("AGB","BSSS"), arrayOf("AGZ","BSSS")).toList())

private fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
    var answer = intArrayOf()

    targets.forEach { s ->
        val list = mutableListOf<Int>()
        s.forEach { c->
            var min = 102
            keymap.forEach { if(it.contains(c)) min = minOf(it.indexOf(c)+1,min) }

            if(min == 102) min = -1
            list.add(min)
        }
        answer += if(list.contains(-1)) -1
        else list.sum()
    }

    return answer
}