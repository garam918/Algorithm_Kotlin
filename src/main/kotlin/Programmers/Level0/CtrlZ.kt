package Programmers.Level0

import java.util.Stack

fun main() = println(solution("1 2 3 Z Z"))

private fun solution(s: String): Int {
    var answer = 0
    val stack = Stack<Int>()

    s.split(" ").forEach {
        if(it == "Z") {
            answer -= stack.lastElement()
            stack.removeLast()
        }
        else {
            stack.add(it.toInt())
            answer += stack.lastElement()
        }
    }

    return answer
}