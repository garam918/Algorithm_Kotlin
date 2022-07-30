package BOJ.DFS

private lateinit var arr : Array<Array<String>>
private lateinit var visit : Array<BooleanArray>
private var count = 0


fun main() = repeat(readLine()!!.toInt()) {
    count = 0
    val (hw1,hw2) = readLine()!!.split(" ")
    val h = hw1.toInt()
    val w = hw2.toInt()

    arr = Array(h+2) { Array(w+2) { "" } }
    visit = Array(h+2) { BooleanArray(w+2) }

    repeat(h) {
        readLine()!!.toString().forEachIndexed { index, c ->
            arr[it+1][index+1] = c.toString()
        }
    }

    for(i in 1 .. h) {
        for(j in 1 .. w) {
            if(!visit[i][j] && arr[i][j] == "#") {
                dfs(i,j)
                count++
            }
        }
    }
    println(count)
}

private fun dfs(x: Int, y: Int) {
    if(!visit[x][y]) {
        visit[x][y] = true

        if(arr[x+1][y] == "#" && !visit[x+1][y]) dfs(x+1,y)
        if(arr[x][y+1] == "#" && !visit[x][y+1]) dfs(x,y+1)
        if(arr[x-1][y] == "#" && !visit[x-1][y]) dfs(x-1,y)
        if(arr[x][y-1] == "#" && !visit[x][y-1]) dfs(x,y-1)

    }
}