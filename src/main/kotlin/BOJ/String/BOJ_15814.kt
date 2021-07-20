package BOJ.String

fun main() {
    var s = readLine()!!.toString()

    repeat(readLine()!!.toInt()) {
        val ab = readLine()!!.toString().split(" ")
        val a = ab[0].toInt()
        val b = ab[1].toInt()
        var temp = ""

        s.onEachIndexed { index, c ->
            temp += when(index) {
                a -> s[b]
                b -> s[a]
                else -> c
            }
        }
        s = temp

    }

    println(s)
}