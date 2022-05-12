package BOJ.BruteForce

fun main() {
    var count = 0

    repeat(readLine()!!.toInt()) {
        (it+1).toString().forEach {
            if(it.toString().toInt() == 3 || it.toString().toInt() == 6 || it.toString().toInt() == 9) count++
        }
    }
    println(count)
}