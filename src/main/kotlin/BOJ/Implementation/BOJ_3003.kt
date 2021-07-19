package BOJ.Implementation

fun main() {
    val a = intArrayOf(1,1,2,2,2,8)
    val s = readLine()!!.toString().split(" ")

    s.forEachIndexed { index, str ->
        if(index != 5) {
            print(a[index] - str.toInt())
            print(" ")
        }
        else print(a[index] - str.toInt())
    }
}