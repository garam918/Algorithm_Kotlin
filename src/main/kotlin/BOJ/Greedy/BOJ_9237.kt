package BOJ.Greedy

fun main() {
    val n = readLine()!!.toInt()
    val t = readLine()!!.toString().split(" ")

    val array = IntArray(n)

    t.sortedByDescending { it.toInt() }.forEachIndexed { index, s ->
        array[index] = (index + 1 + s.toInt())
    }

    println(array.maxOrNull()?.plus(1))
}