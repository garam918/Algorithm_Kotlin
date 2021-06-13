package BOJ.String

fun main() {

    val array = ArrayList<String>()

    repeat(readLine()!!.toInt()) {
        val mi = readLine()!!.toString()
        array.add(mi)
    }
    when(readLine()!!.toInt()) {
        1 -> {
            array.onEachIndexed { index, s ->
                println(s)
            }
        }
        2 -> {
            array.onEachIndexed { index, s ->
                println(s.reversed())
            }
        }
        3 -> {
            array.reversed().forEachIndexed { index, s ->
                println(s)
            }
        }
    }
}