package BOJ.Hash

fun main() {

    val nm = readLine()!!.split(" ")
    val n = nm[0].toInt()
    val m = nm[1].toInt()

    val map = mutableMapOf<String,String>()

    repeat(n) {
        val s = readLine()!!.split(" ")
        map[s[0]] = s[1]
    }

    val list = arrayListOf<String>()

    repeat(m) {
        list.add(readLine()!!)
    }

    list.forEach {
        println(map[it])
    }

}