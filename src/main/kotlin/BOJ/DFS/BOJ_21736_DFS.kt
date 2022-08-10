package BOJ.DFS

private lateinit var arr : ArrayList<String>
private lateinit var visit: Array<BooleanArray>
private var count = 0

fun main() {

    val nm = readLine()!!.split(" ")
    val n = nm[0].toInt()
    val m = nm[1].toInt()

    arr = ArrayList(n+2)
    visit = Array(n+2) { BooleanArray(m+2) }

    repeat(m+2) {
        if(arr.isEmpty()) arr.add(" ")
        else arr[0] = arr[0] + " "
    }

    repeat(n) { arr.add(" ${readLine()!!} ") }

    repeat(m+2) {
        if(arr.last().isNotBlank()) arr.add(" ")
        else arr[n+1] = arr[n+1] + " "
    }

    for(i in 1 .. n) {
        for(j in 1.. m) {
            if(arr[i][j] == 'I') {
                dfs(i,j)
            }
        }
    }
    if(count == 0) println("TT")
    else println(count)
}

private fun dfs(x:Int, y:Int) {
    if(arr[x][y] == 'X') {
        visit[x][y] = true
        return
    }

    if(!visit[x][y]) {
        visit[x][y] = true

        if(arr[x][y] == 'P') count++

        if(arr[x+1][y] != ' ' && arr[x+1][y] != 'X' && !visit[x+1][y]) dfs(x+1,y)
        if(arr[x][y+1] != ' ' && arr[x][y+1] != 'X' && !visit[x][y+1]) dfs(x,y+1)
        if(arr[x-1][y] != ' ' && arr[x-1][y] != 'X' && !visit[x-1][y]) dfs(x-1,y)
        if(arr[x][y-1] != ' ' && arr[x][y-1] != 'X' && !visit[x][y-1]) dfs(x,y-1)
    }
}