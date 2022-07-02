package BOJ.DFS

private lateinit var arr : Array<IntArray>
private lateinit var visit : Array<BooleanArray>
private val list = mutableListOf<Int>()
private var count = 0

fun main() {
    val mn = readLine()!!.split(" ")
    val m = mn[0].toInt()
    val n = mn[1].toInt()

    arr = Array(m+2) { IntArray(n+2) }
    visit = Array(m+2) { BooleanArray(n+2) }

    repeat(m) {
        readLine()!!.split(" ").forEachIndexed { index, s ->
            arr[it+1][index+1] = s.toInt()
        }
    }

    for(i in 1 .. m) {
        for(j in 1 .. n) {
            if(!visit[i][j] && arr[i][j] == 1) {
                dfs(i, j)
                list.add(count)

                count = 0
            }

        }
    }
    println(list.size)

}

private fun dfs(x: Int, y:Int) {
    if(!visit[x][y]) {
        visit[x][y] = true
        count++

        if(arr[x+1][y] == 1 && !visit[x+1][y]) dfs(x+1,y)
        if(arr[x][y+1] == 1 && !visit[x][y+1]) dfs(x,y+1)
        if(arr[x-1][y] == 1 && !visit[x-1][y]) dfs(x-1,y)
        if(arr[x][y-1] == 1 && !visit[x][y-1]) dfs(x,y-1)

        if(arr[x+1][y+1] == 1 && !visit[x+1][y+1]) dfs(x+1,y+1)
        if(arr[x-1][y-1] == 1 && !visit[x-1][y-1]) dfs(x-1,y-1)
        if(arr[x+1][y-1] == 1 && !visit[x+1][y-1]) dfs(x+1,y-1)
        if(arr[x-1][y+1] == 1 && !visit[x-1][y+1]) dfs(x-1,y+1)

    }
}