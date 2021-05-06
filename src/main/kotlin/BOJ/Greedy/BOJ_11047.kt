package BOJ.Greedy

fun main() {
    val s = readLine()!!

    val n = s.split(" ")[0].toInt()
    val k = s.split(" ")[1].toInt()
    var t = k

    var result = 0
    val array = IntArray(n)

    repeat(n) {
        val a = readLine()!!.toInt()
        array[it] = a
    }
    array.sortDescending()

    repeat(array.size) {
        if(array[it] > k) result = 0
        else if(t !=0 ){
            result += (t / array[it])
            t %= array[it]
        }
    }
    println(result)
}
