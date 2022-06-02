package BOJ.Greedy

fun main() {
    val ab = readLine()!!.split(" ")
    val a = ab[0].toInt()
    val b = ab[1].toInt()

    val aMin = a.toString().replace("6","5")
    val bMin = b.toString().replace("6","5")

    val aMax = a.toString().replace("5","6")
    val bMax = b.toString().replace("5","6")

    val min = aMin.toInt() + bMin.toInt()
    val max = aMax.toInt() + bMax.toInt()

    println("$min $max")
}