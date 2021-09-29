package Programmers.Level1

fun main() {
    println(solution(intArrayOf(1,3,2,4,2)).toList())

}

private fun solution(answers: IntArray): IntArray {
    var answer = intArrayOf()

    var one = "12345"
    var two = "21232425"
    var three = "3311224455"

    val list = hashMapOf<Int,Int>()

    var oneCount = 0
    var twoCount = 0
    var threeCount = 0

    one = setRepeat(one,answers.size)
    two = setRepeat(two,answers.size)
    three = setRepeat(three,answers.size)

    answers.forEachIndexed { index, it ->
        if(it == one[index].toString().toInt()) oneCount++
        if(it == two[index].toString().toInt()) twoCount++
        if(it == three[index].toString().toInt()) threeCount++
    }

    list[1] = oneCount
    list[2] = twoCount
    list[3] = threeCount

    list.forEach { it ->
        if(it.value == list.values.maxOrNull()) answer += intArrayOf(it.key)
    }

    return answer.sortedArray()
}

private fun setRepeat(str : String, size : Int) = str.repeat((size / str.length) + 1).substring(0,size)