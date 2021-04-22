package BOJ.String

fun main() {
    val s = readLine().toString()

    val t = "abcdefghijklmnopqrstuvwxyz"

    var answer = ""

    repeat(t.length) {

        answer += if(s.contains(t[it])) {
            "${s.indexOf(t[it])}"
        }
        else "-1"

        answer += " "

    }

    println(answer.trimEnd())

}