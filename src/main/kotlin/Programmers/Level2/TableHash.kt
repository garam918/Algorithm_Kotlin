package Programmers.Level2

fun main() = println(solution(arrayOf(intArrayOf(2,2,6), intArrayOf(1,5,10), intArrayOf(4,2,9), intArrayOf(3,8,3))
    ,2,2,3))

private fun solution(data: Array<IntArray>, col: Int, row_begin: Int, row_end: Int): Int {
    var answer = 0

    data.sortedWith(compareBy({ it[col-1] } , { -it[0] })).forEachIndexed { index, ints ->
        if(index+1 in row_begin .. row_end) answer = answer.xor(ints.sumOf { it  % (index + 1) })
    }

    return answer
}