package Programmers.Level1

fun main() = println(solution(intArrayOf(2,1,1,2,3,1,2,3,1)))

private fun solution(ingredient: IntArray): Int {
    var answer = 0
    val builder = StringBuilder()

    ingredient.forEach {
        builder.append(it)
        if(builder.length > 3 && builder.subSequence(builder.length - 4,builder.length) == "1231") {
            answer++
            builder.delete(builder.length-4,builder.length)
        }
    }

    return answer
}