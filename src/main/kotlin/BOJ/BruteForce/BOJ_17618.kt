package BOJ.BruteForce

fun main() {
    var count = 0
    repeat(readLine()!!.toInt()) {
        var temp = 0
        (it+1).toString().forEach {
            temp += (it.toString().toInt())
        }

        if((it+1) % temp == 0) count++
    }
    println(count)
}