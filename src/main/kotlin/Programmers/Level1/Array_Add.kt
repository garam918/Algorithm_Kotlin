package Programmers

fun main() {
//    solution(arrayOf(intArrayOf(1,2),intArrayOf(2,3)),arrayOf(intArrayOf(3,4),intArrayOf(5,6)))
    solution(arrayOf(intArrayOf(1),intArrayOf(2)),arrayOf(intArrayOf(3),intArrayOf(4)))

}

private fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
    var answer = arrayOf<IntArray>()

    var temp = 0

    for (i in arr1.indices) {
        var tempArray = intArrayOf()
        for(j in arr2[0].indices) {
            temp = arr1[i][j] + arr2[i][j]
            tempArray += intArrayOf(temp)

        }
        answer += tempArray

    }

    return answer
}
