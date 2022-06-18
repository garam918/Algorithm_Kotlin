package Programmers.Level3

fun main() {
    println(solution(arrayOf("classic",  "classic", "classic", "pop"), intArrayOf(500, 150, 800, 2500)).toList())
}

private fun solution(genres: Array<String>, plays: IntArray): IntArray {
    var answer = intArrayOf()

    val hashMap = HashMap<String,List<HashMap<Int,Int>>>()

    repeat(genres.size) {
        if(hashMap[genres[it]] == null ) hashMap[genres[it]] = listOf(hashMapOf(Pair(it,plays[it])))
        else hashMap[genres[it]] = hashMap[genres[it]]!!.plus(hashMapOf(Pair(it,plays[it])))
    }

    hashMap.toList().sortedByDescending { pair ->
        pair.second.sumOf { it.values.sum() }
    }.forEach { values->
        var index = 2
        if(values.second.size == 1) index = 1

        values.second.sortedByDescending { it.values.maxOrNull() }.subList(0,index).forEach {
            answer += it.keys.first()
            if(!answer.contains(it.keys.last())) answer += it.keys.last()
//            it.keys.forEach { if(!answer.contains(it)) answer += it }
        }
    }

    return answer
}