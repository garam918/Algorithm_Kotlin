package BOJ.DFS

private lateinit var arr : Array<IntArray>
private lateinit var visit : Array<BooleanArray>
private var count = 0
private val list = mutableListOf<Int>()


fun main() {

    val nm = readLine()!!.split(" ")
    val n = nm[0].toInt()
    val m = nm[1].toInt()

    arr = Array(n+2) { IntArray(m+2) }
    visit = Array(n+2) { BooleanArray(m+2) }

    repeat(n) {
        readLine()!!.split(" ").forEachIndexed { index, s ->
            arr[it+1][index+1] = s.toInt()
        }
    }

    for(i in 1 .. n) {
        for(j in 1 .. m) {
            if(arr[i][j] == 1 && !visit[i][j]) {
                dfs(i,j)
                list.add(count)
                count = 0
            }
        }
    }

    println(list.size)
    if(list.isEmpty()) println(0)
    else println(list.maxOrNull()!!)

}

private fun dfs(x:Int, y:Int) {
    if(!visit[x][y]) {
        visit[x][y] = true
        count++

        if(arr[x+1][y] == 1 && !visit[x+1][y]) dfs(x+1,y)
        if(arr[x][y+1] == 1 && !visit[x][y+1]) dfs(x,y+1)
        if(arr[x-1][y] == 1 && !visit[x-1][y]) dfs(x-1,y)
        if(arr[x][y-1] == 1 && !visit[x][y-1]) dfs(x,y-1)



    }
}