package BOJ.DFS

private lateinit var arr : Array<Array<String>>
private lateinit var visit : Array<BooleanArray>
private val list = mutableListOf<String>()
private val sizeList = mutableListOf<Int>()

fun main() {

    val (nmk1,nmk2,nmk3) = readLine()!!.split(" ")
    val n = nmk1.toInt()
    val m = nmk2.toInt()
    val k = nmk3.toInt()

    arr = Array(n+2) { Array(m+2) { " " } }
    visit = Array(n+2) { BooleanArray(m+2) }

    repeat(k) {
        val (x,y) = readLine()!!.split(" ")

        arr[x.toInt()][y.toInt()] = "#"

    }

    for(i in 1 .. n) {
        for(j in 1 .. m) {
            if(arr[i][j] == " ") arr[i][j] = "."
        }
    }

    for(i in 1 .. n) {
        for(j in 1 .. m) {
            if(!visit[i][j]) {
                dfs(i,j)

                sizeList.add(list.size)
                list.clear()
            }
        }
    }
    println(sizeList.maxOrNull())
}

private fun dfs(x: Int, y:Int) {
    if(!visit[x][y]) {
        visit[x][y] = true

        if(arr[x][y] == "#") list.add(arr[x][y])

        if(arr[x+1][y] == "#" && arr[x+1][y] != " " && !visit[x+1][y]) dfs(x+1,y)
        if(arr[x][y+1] == "#" && arr[x][y+1] != " " && !visit[x][y+1]) dfs(x,y+1)
        if(arr[x-1][y] == "#" && arr[x-1][y] != " " && !visit[x-1][y]) dfs(x-1,y)
        if(arr[x][y-1] == "#" && arr[x][y-1] != " " && !visit[x][y-1]) dfs(x,y-1)

    }
}