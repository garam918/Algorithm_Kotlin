package BOJ.String

fun main() {
    val s = readLine()!!.toString()
    val array = ArrayList<String> (s.length)

    repeat(s.length) {
        array.add(s.slice(IntRange(it,s.length-1)))
    }

    array.sortedBy { it }.onEachIndexed { index, s ->
        println(s)
    }
}