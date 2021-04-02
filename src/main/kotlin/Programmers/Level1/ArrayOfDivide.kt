package Programmers.Level1

fun main() {
    solution(intArrayOf(3,2,6),5)
}

private fun solution(arr: IntArray, divisor: Int): IntArray {
    var answer = intArrayOf()
    var count = 0
    for(i in arr.indices) {
        if( arr[i] % divisor == 0) {
            answer += intArrayOf(arr[i])
            count++
        }
    }
    if ( count == 0) {
        answer = intArrayOf(-1)
    }
    return answer.sortedArray()
}