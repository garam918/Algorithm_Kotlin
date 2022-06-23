package Programmers.Level2

fun main() {

    println(solution(arrayOf(arrayOf("yellowhat", "headgear"),arrayOf("bluesunglasses", "eyewear"),arrayOf("green_turban", "headgear"))))

}

private fun solution(clothes: Array<Array<String>>): Int {
    var answer = 1

    val hash = hashMapOf<String,ArrayList<String>>()

    clothes.forEach {
        if (hash[it[1]].isNullOrEmpty()) hash[it[1]] = arrayListOf(it[0])
        else hash[it[1]]?.add(it[0])
    }

    if(hash.size >= 2) hash.forEach { (t, u) ->
        answer *= u.size + 1
    }

    else hash.forEach { (t, u) ->
        answer += u.size
    }

    answer--

    return answer
}