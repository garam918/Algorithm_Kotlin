package BOJ.Greedy

fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").sortedBy { it.toInt() }
    val b = readLine()!!.split(" ").sortedByDescending { it.toInt() }

    var count = 0

    a.forEachIndexed { index, s ->
        count += (s.toInt() * b[index].toInt())
    }

    println(count)
}