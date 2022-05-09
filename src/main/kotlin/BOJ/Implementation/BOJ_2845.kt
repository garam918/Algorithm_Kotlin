package BOJ.Implementation

fun main() {
    val lp = readLine()!!.split(" ")
    val l = lp[0].toInt()
    val p = lp[1].toInt()

    val participant = readLine()!!.split(" ")

    repeat(participant.size) {
        print(participant[it].toInt() - (l * p))
        print(" ")
    }
}