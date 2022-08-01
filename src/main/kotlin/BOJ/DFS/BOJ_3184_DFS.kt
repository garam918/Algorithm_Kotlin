package BOJ.DFS

private lateinit var arr : Array<Array<String>>
private lateinit var visit : Array<BooleanArray>
private var wolfCount = 0
private var goatCount = 0

fun main() {

    val (rc1, rc2) = readLine()!!.split(" ")
    val r = rc1.toInt()
    val c = rc2.toInt()

    var goat = 0
    var wolf = 0

    arr = Array(r+2) { Array(c+2) { "" } }
    visit = Array(r+2) { BooleanArray(c+2) }

    repeat(r) {
        readLine()!!.forEachIndexed { index,c ->
            arr[it+1][index+1] = c.toString()
        }
    }

    for(i in 1 .. r) {
        for(j in 1 .. c) {
            if(!visit[i][j] && arr[i][j] != "#") {
                dfs(i,j)

                if(wolfCount >= goatCount) wolf += wolfCount
                else goat += goatCount

                wolfCount = 0
                goatCount = 0
            }
        }
    }

    println("$goat $wolf")
}

private fun dfs(x: Int, y: Int) {
    if(!visit[x][y] && arr[x][y] != "" && arr[x][y] != "#") {
        visit[x][y] = true

        if(arr[x][y] == "v") wolfCount++
        else if(arr[x][y] == "o") goatCount++

        if (arr[x+1][y] != "#" && arr[x+1][y] != "" && !visit[x+1][y]) dfs(x+1,y)
        if (arr[x][y+1] != "#" && arr[x][y+1] != "" && !visit[x][y+1]) dfs(x,y+1)
        if (arr[x-1][y] != "#" && arr[x-1][y] != "" && !visit[x-1][y]) dfs(x-1,y)
        if (arr[x][y-1] != "#" && arr[x][y-1] != "" && !visit[x][y-1]) dfs(x,y-1)

    }
}