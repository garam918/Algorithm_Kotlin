package BOJ.String

fun main() {
    val s = readLine()!!.toString().split(" ")

    val n = s[0]
    val m = s[1].toInt()

    var answer = ""

    loop@
    for(i in 0 until n.toInt()) {
        answer += n

        if(answer.length >= m) {
            answer = answer.slice(IntRange(0,m-1))
            break@loop
        }
    }

    println(answer)

}