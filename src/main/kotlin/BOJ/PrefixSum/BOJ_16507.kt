package BOJ.PrefixSum

fun main() {

    val (r,c,q) = readln().split(" ").map { it.toInt() }

    val arr = Array(r+1) { IntArray(c+1) }

    repeat(r) {
        readln().split(" ").map { it.toInt() }.forEachIndexed { index, i ->
            if(index != 0) arr[it+1][index+1] = arr[it+1][index] + i
            else arr[it+1][1] = i
        }
    }

    repeat(q) {
        var answer = 0
        val (r1,c1,r2,c2) = readln().split(" ").map { it.toInt() }
        val div = (r2-r1+1) * (c2-c1+1)

        repeat(r2-r1+1) {
            answer += arr[r1+it][c2] - arr[r1+it][c1-1]
        }

        println(answer / div)
    }
}