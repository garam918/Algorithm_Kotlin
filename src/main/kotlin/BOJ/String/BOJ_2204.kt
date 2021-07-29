package BOJ.String

fun main() {
    var n = 1
    while( n != 0) {
        n = readLine()!!.toInt()
        if(n == 0) break
        else {
            val list = MutableList(n) { "" }
            repeat(n) {
                list[it] = readLine()!!.toString()
            }
            println(list.sortedBy { it.toUpperCase() }[0])
        }
    }
}