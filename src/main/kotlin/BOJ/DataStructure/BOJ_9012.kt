package BOJ.DataStructure

import java.util.*

fun main() = repeat(readLine()!!.toInt()) {

    val stack = Stack<Char>()

    readLine()!!.forEach {
        if(it == '(') stack.add(it)
        else {
            if (stack.isNotEmpty() && stack.lastElement() == '(') stack.removeLast()
            else stack.add(it)
        }
    }
    if(stack.isNotEmpty()) println("NO")
    else println("YES")
}