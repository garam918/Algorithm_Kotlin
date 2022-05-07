package BOJ.BruteForce

fun main() {
    val n = readLine()!!.toInt()
    val list = mutableListOf<Int>()

    readLine()!!.split(" ").forEach {
        list.add(it.toInt())
    }

    repeat(list.maxOrNull()!!) {
        if(n == 2) {
            if ((list[0] % (it+1)) == 0 && (list[1] % (it+1) == 0)) println(it+1)
        }
        else {
            if ((list[0] % (it+1)) == 0 && (list[1] % (it+1) == 0) && (list[2] % (it+1) == 0)) println(it+1)
        }
    }
}