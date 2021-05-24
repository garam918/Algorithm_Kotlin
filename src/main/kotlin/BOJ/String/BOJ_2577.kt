package BOJ.String

fun main() {

    var s = 1
    repeat(3) {
        val a = readLine()!!.toInt()
        s *= a
    }
    val array = IntArray(10) { 0 }

    s.toString().mapIndexed { index, c ->
        when(c) {
            '0' -> {
                array[0]++
            }
            '1' -> {
                array[1]++
            }
            '2' -> {
                array[2]++
            }
            '3' -> {
                array[3]++
            }
            '4' -> {
                array[4]++
            }
            '5' -> {
                array[5]++
            }
            '6' -> {
                array[6]++
            }
            '7' -> {
                array[7]++
            }
            '8' -> {
                array[8]++
            }
            '9' -> {
                array[9]++
            }
            else -> {

            }
        }
    }
    repeat(array.size) {
        println(array[it])
    }
}