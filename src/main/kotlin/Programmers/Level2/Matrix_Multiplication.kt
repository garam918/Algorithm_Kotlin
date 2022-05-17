package Programmers.Level2

fun main() {

    val arr1 = arrayOf(intArrayOf(2,3,2), intArrayOf(4,2,4), intArrayOf(3,1,4))
    val arr2 = arrayOf(intArrayOf(5,4,3), intArrayOf(2,4,1), intArrayOf(3,1,1))

    println(solution(arr1,arr2)[2].toList())

}

private fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
    var answer = arrayOf<IntArray>()

    arr1.forEach { ints ->
        var tempArray = intArrayOf()
        for(i in arr2[0].indices) {
            var temp = 0
            for(j in ints.indices) {
                temp += ints[j] * arr2[j][i]

            }
            tempArray += temp
        }

        answer += tempArray
    }

    return answer
}