package BOJ.PrefixSum

fun main() {

    val (n,k) = readln().split(" ")

    var arr = intArrayOf()

    val list = readln().split(" ")
    var temp = 0

    repeat(k.toInt()) {
        temp += list[it].toInt()
    }
    arr += temp

    for(i in 1 until n.toInt()-k.toInt()+1) {
        temp = 0
        repeat(k.toInt()) {
            temp += list[i+it].toInt()
        }
        arr += temp
    }

    println(arr.maxOrNull()!!)
}