package BOJ.String

fun main() {
    val jae = readLine()!!.toString()
    val doc = readLine()!!.toString()

    if(jae.length >= doc.length) println("go")
    else println("no")
}