package Programmers.Level1

fun main() {
    println(solution(intArrayOf(5,0,2,7)).toList())
}
private fun solution(numbers: IntArray): IntArray {
    val arrayList = ArrayList<Int>()

    for(i in numbers.indices) {
        for(j in (i+1) until numbers.size) {
            arrayList.add(numbers[i] + numbers[j])
        }
    }

    return arrayList.distinct().sorted().toIntArray()
}