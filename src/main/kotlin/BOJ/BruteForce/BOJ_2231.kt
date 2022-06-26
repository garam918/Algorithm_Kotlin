package BOJ.BruteForce

fun main() {

    val n = readLine()!!.toInt()

    val list = mutableListOf<Int>()

    repeat(n) {
        var temp = (it+1)
        (it+1).toString().forEach { c ->
            temp += c.toString().toInt()
        }

        if(temp == n) list.add(it+1)
    }

    if(list.isEmpty()) println(0)
    else println(list.minOrNull())

}