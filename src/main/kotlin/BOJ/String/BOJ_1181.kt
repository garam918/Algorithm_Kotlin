package BOJ.String

fun main() {
    val n = readLine()!!.toInt()
    val array = ArrayList<String> (n)
    repeat(n) {
        array.add(readLine()!!.toString())
    }
    array.sortWith(compareBy ( { it.length } , { it }))
    array.toSet().mapIndexed { index, s ->
        println(s)
    }
}