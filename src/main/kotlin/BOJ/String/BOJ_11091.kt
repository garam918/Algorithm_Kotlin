package BOJ.String

fun main() = repeat(readLine()!!.toInt()) {
    val al = "abcdefghijklmnopqrstuvwxyz"
    var answer = ""

    val s = readLine()!!.toString().toLowerCase().replace(" ","")

    al.onEachIndexed { index, c ->
        if(!s.contains(c) && !answer.contains(c)) {
            answer += c
        }
    }
    if(answer == "") println("pangram")
    else {
        print("missing ")
        answer.toList().sortedBy { it }.onEachIndexed { index, c ->
            print(c)
        }
        println()
    }
}