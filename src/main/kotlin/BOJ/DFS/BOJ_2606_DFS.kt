package BOJ.DFS

private lateinit var arr : Array<IntArray>
private lateinit var visit : BooleanArray
private var count = 0
fun main() {

    val n = readLine()!!.toInt()
    val m = readLine()!!.toInt()

    arr = Array(n+2) { IntArray(n+2) }

    visit = BooleanArray(n+2)

    repeat(m) {
        val ab = readLine()!!.split(" ")
        val a = ab[0].toInt()
        val b = ab[1].toInt()

        arr[a][b] = 1
        arr[b][a] = 1

    }
    dfs(1)
    println(count-1)

}

private fun dfs(x:Int) {
    if(!visit[x]) {
        visit[x] = true
        count++

        for (i in 1 until visit.size) {
            if (arr[x][i] == 1&& !visit[i]) dfs(i)
        }
    }
}