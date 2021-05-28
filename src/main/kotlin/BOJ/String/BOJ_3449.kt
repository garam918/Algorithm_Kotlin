package BOJ.String

fun main() = repeat(readLine()!!.toInt()) {
        var answer = 0
        val a = readLine()!!.toString()
        val b = readLine()!!.toString()
        repeat(a.length) {
            if(a[it] != b[it]) answer++
        }
        println("Hamming distance is $answer.")
}
