package BOJ.DataStructure

import java.util.Stack

fun main() {

    var input: String
    while(true) {
        input = readln()
        val stack = Stack<Char>()
        var answer: String

        if(input ==".") break
        else {
            input.forEach {
                when (it) {
                    '(' -> stack.push(it)
                    '{' -> stack.push(it)
                    '[' -> stack.push(it)
                    ')' -> if (stack.isNotEmpty() && stack.last() == '(') stack.removeLast() else stack.push(it)
                    '}' -> if (stack.isNotEmpty() && stack.last() == '{') stack.removeLast() else stack.push(it)
                    ']' -> if (stack.isNotEmpty() && stack.last() == '[') stack.removeLast() else stack.push(it)
                }
            }
            answer = if (stack.isEmpty()) "yes"
            else "no"

            println(answer)
        }
    }
}