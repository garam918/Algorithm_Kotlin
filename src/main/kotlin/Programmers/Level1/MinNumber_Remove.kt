package Programmers

fun main() {
    println(solution(intArrayOf(4,3,2,1)).toList())
}
// 배열을 asList로 받아서 minus 하는 것 보다 filter로 거르는 게 더 빠름
private fun solution(arr: IntArray): IntArray {

    return if (arr.size == 1) {
        intArrayOf(-1)
    }else {
        arr.filter { it != arr.min() }.toIntArray()
    }
}