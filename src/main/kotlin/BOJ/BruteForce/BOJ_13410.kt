package BOJ.BruteForce

fun main() {
    val nk = readLine()!!.split(" ")
    val n = nk[0].toInt()
    val k = nk[1].toInt()

    val list = arrayListOf<Int>()

    repeat(k) {
        list.add( (n * (it+1)).toString().reversed().toInt() )
    }

    println(list.maxOrNull())
}