package BOJ.BinarySearch

private lateinit var list : MutableList<Int>
private lateinit var n : String

fun main() {

    val kn = readLine()!!.split(" ")
    val k = kn[0].toInt()
    n = kn[1]

    list = mutableListOf()

    repeat(k) { list.add(readLine()!!.toInt()) }

    var min = 0L
    var max : Long = (Int.MAX_VALUE).toLong() + 1

    while(min + 1 < max) {
        val mid : Long = (min + max) / 2

        if(check(mid)) max = mid
        else min = mid

    }

    println(max-1)

}

private fun check(length : Long) : Boolean {
    var sum = 0L

    for(i in list.indices) {
        if(list[i] >= length) sum += list[i] / length
    }

    return sum < n.toInt()
}