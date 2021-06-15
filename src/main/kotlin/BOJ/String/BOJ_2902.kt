package BOJ.String

fun main() {
    readLine()!!.toString().split("-").forEachIndexed { index, s ->
        print(s.first())
    }
}