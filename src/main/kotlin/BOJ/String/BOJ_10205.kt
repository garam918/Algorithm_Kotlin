package BOJ.String

fun main() {
    val k = readLine()!!.toInt()
    val temp = mutableListOf<Int>()

    repeat(k) {
        var h = readLine()!!.toInt()

        readLine()!!.toString().onEachIndexed { index, c ->
            if (c == 'b') h--
            else if (c == 'c') h++
        }

        temp.add(h)
    }

    repeat(k) {
        println("Data Set ${it + 1}:")
        println(temp[it])
        if(it != k-1) println()

    }
}