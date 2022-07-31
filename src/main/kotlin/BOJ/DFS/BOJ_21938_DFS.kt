package BOJ.DFS

private lateinit var arr : Array<IntArray>
private lateinit var visit : Array<BooleanArray>
private var t = 0
private val list = mutableListOf<Int>()
private var count = 0

fun main() {
    val (nm1,nm2) = readLine()!!.split(" ")
    val n = nm1.toInt()
    val m = nm2.toInt()

    arr = Array(n+2) { IntArray(m+2) { 256 } }
    visit = Array(n+2) { BooleanArray(m+2) }

    repeat(n) {
        var temp = 0
        readLine()!!.split(" ").forEachIndexed { index, s ->
            if((index + 1) % 3 == 0) {
                temp += s.toInt()
                arr[it+1][(index + 1) / 3] = (temp / 3)
                temp = 0
            }
            else temp += s.toInt()
        }
    }
    t = readLine()!!.toInt()

    for(i in 1 .. n) {
        for(j in 1 .. m) {
            if(!visit[i][j] && arr[i][j] >= t) {
                dfs(i,j)
                if(list.isNotEmpty()) count++

                list.clear()
            }

        }
    }

    println(count)
}

private fun dfs(x: Int, y: Int) {
    if(!visit[x][y]) {
        visit[x][y] = true
        if (arr[x][y] >= t && arr[x][y] != 256) list.add(arr[x][y])

        if(arr[x+1][y] >= t && arr[x+1][y] != 256 && !visit[x+1][y]) dfs(x+1,y)
        if(arr[x][y+1] >= t && arr[x][y+1] != 256 && !visit[x][y+1]) dfs(x,y+1)
        if(arr[x-1][y] >= t && arr[x-1][y] != 256 && !visit[x-1][y]) dfs(x-1,y)
        if(arr[x][y-1] >= t && arr[x][y-1] != 256 && !visit[x][y-1]) dfs(x,y-1)

    }
}