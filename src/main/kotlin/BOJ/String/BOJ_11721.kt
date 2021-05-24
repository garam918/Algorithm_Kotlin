package BOJ.String

fun main() {
    readLine()!!.toString().mapIndexed { index, c ->
        when(index % 10) {
            in 0 .. 8 -> {
                print(c)
            }
            9 -> {
                println(c)
            }
        }
    }
}