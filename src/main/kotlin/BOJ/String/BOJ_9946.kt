package BOJ.String

fun main() {
    var case = 0
    while(true) {
        case++
        var answer: String
        val s = readLine()!!.toString()
        val s2 = readLine()!!.toString()

        if(s == "END" && s2 == "END") break
        else {
            answer = if(s.toCharArray().sortedBy { it } == s2.toCharArray().sortedBy { it }) "same"
            else "different"
        }
        println("Case $case: $answer")
    }
}