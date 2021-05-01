package Programmers

fun main() {
    println(solution(intArrayOf(44, 1, 0, 0, 31, 25), intArrayOf(31, 10, 45, 1, 6, 19)).toList())
}

private fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
    val answer: IntArray
    var min_count = 0
    var zero_count = 0

    repeat(lottos.size) {
        if(lottos[it] == 0) zero_count++
        for(i in win_nums.indices) {
            if(lottos[it] == win_nums[i]) min_count++
        }
    }

    answer = intArrayOf(rank(min_count+zero_count),rank(min_count))
    return answer
}

private fun rank(n: Int) : Int {
    return when(n) {
        6 -> 1
        5 -> 2
        4 -> 3
        3 -> 4
        2 -> 5
        else -> 6
    }
}