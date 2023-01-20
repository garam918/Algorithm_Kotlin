package BOJ.PrefixSum

fun main() {
    val (n,m) = readln().split(" ").map { it.toInt() }
    val arr = Array(n+1) { IntArray(m+1) }
    repeat(n) {
        readln().split(" ").forEachIndexed { index, s ->
            if(index != 0) arr[it+1][index+1] = arr[it+1][index] + s.toInt()
            else arr[it+1][1] = s.toInt()
        }
    }

    repeat(readln().toInt()) {
        val (i,j,x,y) = readln().split(" ").map { it.toInt() }
        var answer = 0
        repeat(x-i+1) {
            answer += (arr[i+it][y] - arr[i+it][j-1])
        }
        println(answer)
    }
}