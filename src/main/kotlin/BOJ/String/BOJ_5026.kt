package BOJ.String

fun main() = repeat(readLine()!!.toInt()) {
    val s = readLine()!!.toString()
    var answer = ""
    var temp = 0
    if(s.contains('+')) {
        s.split('+').forEachIndexed { index, str ->
            temp += str.toInt()
        }
        answer = temp.toString()
    }
    else answer = "skipped"

    println(answer)
}