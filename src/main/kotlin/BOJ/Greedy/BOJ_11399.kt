package BOJ.Greedy

fun main() {
    val n = readLine()!!.toInt()

    val array = IntArray(n)
    var temp = 0
    var result = 0

    val p = readLine()!!.split(" ")

    repeat(n) {
        array[it] = p[it].toInt()
    }
    array.sort()
    array.mapIndexed { index, i ->
        temp += i
        result += temp
    }
    println(result)
}