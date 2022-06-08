package BOJ.DFS

private lateinit var arr : Array<IntArray>
private lateinit var visit : BooleanArray
private var n = 0
private var count = 0

fun main() {

    val nm = readLine()!!.split(" ")
    n = nm[0].toInt()
    val m = nm[1].toInt()

    arr = Array(n+1) { IntArray(n+1) }
    visit = BooleanArray(n+1) { false }

    repeat(m) {
        val uv = readLine()!!.split(" ")
        val u = uv[0].toInt()
        val v = uv[1].toInt()

        arr[u][v] = 1
        arr[v][u] = 1
    }

    repeat(n) {
        if(!visit[it+1]) {
            dfs(it+1)
            count++
        }
    }

    println(count)
}

private fun dfs(x: Int) {
    if(visit[x]) return
    visit[x] = true

    for(i in 1 .. n) { if (arr[x][i] == 1 && !visit[i]) dfs(i) }
}