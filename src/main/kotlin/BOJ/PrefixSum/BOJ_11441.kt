package BOJ.PrefixSum

fun main() {
    val n = readln().toInt()
    val a = IntArray(n+1)
    readln().split(" ").forEachIndexed { index, s ->
        if(index != 0) a[index+1] = a[index] + s.toInt()
        else a[1] = s.toInt()
    }
    repeat(readln().toInt()) {
        val (i,j) = readln().split(" ").map { it.toInt() }
        println(a[j] - a[i-1])
    }
}