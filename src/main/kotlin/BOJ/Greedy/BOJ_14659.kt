package BOJ.Greedy

fun main() {
    val n = readLine()!!.toInt()
    val h = readLine()!!.toString().split(" ")

    val array = IntArray(h.size) { 0 }

    repeat(h.size) {
        array[it] = h[it].toInt()
    }

    var answer = 0
    var count : Int

    repeat(n) {
        count = 0
        val current = array[it]

        for(i in it+1 until h.size) {
            if (current > array[i]) count++
            else break
        }
        answer = maxOf(answer,count)
    }
    println(answer)
}