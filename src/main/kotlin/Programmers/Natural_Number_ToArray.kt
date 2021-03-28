package Programmers

fun main() {
    solution(12345)
}

private fun solution(n: Long): IntArray {
    var answer = intArrayOf()

    val temp = n.toString()

    val array = IntArray(temp.length)

    for(i in temp.indices) {
        array[i] = temp[i].toString().toInt()
    }

    array.reverse()
    answer = array

    return answer
}