package BOJ.PrefixSum

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val arr = IntArray(n+1)
    readln().split(" ").forEachIndexed { index, s ->
        if(index != 0) arr[index+1] = arr[index] + s.toInt()
        else arr[1] = s.toInt()
    }
    repeat(m) {
        val (i,j) = readln().split(" ").map { it.toInt() }

        println(arr[j] - arr[i-1])
    }
}