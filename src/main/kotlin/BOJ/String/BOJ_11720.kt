package BOJ.String

fun main() {

    val s = readLine()!!.toInt()

    val t = readLine()!!.toString()

    var answer = 0

    repeat(s){
        answer += t[it].toString().toInt()
    }

    println(answer)

}