package BOJ.BruteForce

fun main() {
    val nk = readLine()!!.split(" ")
    val n = nk[0].toInt()
    val k = nk[1].toInt()

    val list = mutableListOf<Int>()

    repeat(n) {
        if( n % (it+1) == 0) list.add(it+1)
    }

    if(list.size < k) println(0)
    else println(list[k-1])
}