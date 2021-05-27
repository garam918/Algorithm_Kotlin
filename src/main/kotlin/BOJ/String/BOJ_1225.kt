package BOJ.String

fun main() {
    val s = readLine()!!.toString().split(" ")
    val a = s[0]
    val b = s[1]

    var answer : Long = 0

    for(i in a.indices) {
        for(j in b.indices) {
            answer += (a[i].toString().toInt()*b[j].toString().toInt())
        }
    }
    println(answer)
}