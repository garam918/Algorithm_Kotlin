package Programmers.Level2

fun main() {

    println(solution("1111111").toList())

}

private fun solution(s: String): IntArray {
    var answer: IntArray = intArrayOf()

    var temp = s

    var zeroCount = 0
    var tranCount = 0

    while(true) {
        if(temp == "1") break
        else {
            temp.forEach {
                if(it == '0') zeroCount++
            }
            temp = temp.filter { it == '1' }
            temp = numToBinary(temp.length)
            tranCount++
        }
    }

    answer += tranCount
    answer += zeroCount

    return answer
}

private fun numToBinary(len : Int) : String{
    var s = ""
    var temp = len

    while(true) {
        if(temp == 0) break
        else {
            s += temp % 2
            temp /= 2
        }
    }

    return s.reversed()
}