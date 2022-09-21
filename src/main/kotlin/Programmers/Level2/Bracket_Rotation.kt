package Programmers.Level2

import java.util.Stack

fun main() {
    println(solution("}}}"))
}

private fun solution(s: String): Int {
    var answer = 0

    var temp = s

    repeat(s.length) {
        temp += temp.first()
        temp = temp.drop(1)

        if(isRight(temp)) answer++
    }

    return answer
}

private fun isRight(s: String) : Boolean{
    val stack = Stack<Char>()

    s.forEach {
        when (it) {
            '(' -> stack.push(it)
            '{' -> stack.push(it)
            '[' -> stack.push(it)
            ')' -> if (stack.isNotEmpty() && stack.last() == '(') stack.removeLast() else stack.push(it)
            '}' -> if (stack.isNotEmpty() && stack.last() == '{') stack.removeLast() else stack.push(it)
            ']' -> if (stack.isNotEmpty() && stack.last() == '[') stack.removeLast() else stack.push(it)
        }
    }

    return stack.isEmpty()
}