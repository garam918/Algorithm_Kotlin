package BOJ.Implementation

fun main() {
    val w = MutableList(10) { 0 }
    val k = MutableList(10) { 0 }

    var wScore = 0
    var kScore = 0

    repeat(10) {
        w[it] = readLine()!!.toInt()
    }
    repeat(10) {
        k[it] = readLine()!!.toInt()
    }

    w.sortDescending()
    k.sortDescending()

    repeat(3) {
        wScore += w[it]
        kScore += k[it]
    }

    println("$wScore $kScore")

}