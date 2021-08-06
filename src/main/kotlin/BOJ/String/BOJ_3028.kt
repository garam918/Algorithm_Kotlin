package BOJ.String

fun main() {

    val array = intArrayOf(1,0,0)

    readLine()!!.toString().forEachIndexed { index, c ->
        when(c) {
            'A' -> {
                array[0] = array[1].also { array[1] = array[0] }
            }
            'B' -> {
                array[1] = array[2].also { array[2] = array[1] }
            }
            'C' -> {
                array[0] = array[2].also { array[2] = array[0] }
            }
        }
    }
    when(array.indexOf(1)) {
        0 -> println(1)
        1 -> println(2)
        2 -> println(3)
    }
}

