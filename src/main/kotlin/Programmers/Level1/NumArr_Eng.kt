package Programmers.Level1

fun main() {
    println(solution("123"))
}
private fun solution(s: String): Int {

    var temp = s

    temp = temp.replace("zero", "0")
    temp = temp.replace("one", "1")
    temp = temp.replace("two", "2")
    temp = temp.replace("three", "3")
    temp = temp.replace("four", "4")
    temp = temp.replace("five", "5")
    temp = temp.replace("six", "6")
    temp = temp.replace("seven", "7")
    temp = temp.replace("eight", "8")
    temp = temp.replace("nine", "9")

    return temp.toInt()
}