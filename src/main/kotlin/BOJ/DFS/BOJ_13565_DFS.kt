package BOJ.DFS

private lateinit var arr : Array<IntArray>
private lateinit var visit: Array<BooleanArray>

private val list = mutableListOf<MutableMap<Int,Int>>()
private var map = mutableMapOf<Int,Int>()

fun main() {

    val mn = readLine()!!.split(" ")
    val m = mn[0].toInt()
    val n = mn[1].toInt()

    arr = Array(m+2) { IntArray(n+2) { 1 } }
    visit = Array(m+2) { BooleanArray(n+2) }

    repeat(m) {
        readLine()!!.forEachIndexed { index, c ->
            arr[it+1][index+1] = c.toString().toInt()
        }
    }


    for(i in 1 .. m) {
        for(j in 1 .. n) {
            if (arr[i][j] == 0 && !visit[i][j]) {
                dfs(i,j)
                list.add(map)
                map = mutableMapOf()
            }
        }
    }

    var answer = "NO"

    for(i in list.indices) {
        if(list[i].containsKey(1) && list[i].containsKey(m)) {
            answer = "YES"
            break
        }
    }
    println(answer)

}

private fun dfs(x:Int, y:Int) {
    if(!visit[x][y]) {
        visit[x][y] = true
        map[x] = y

        if(arr[x+1][y] == 0 && !visit[x+1][y]) dfs(x+1,y)
        if(arr[x][y+1] == 0 && !visit[x][y+1]) dfs(x,y+1)
        if(arr[x-1][y] == 0 && !visit[x-1][y]) dfs(x-1,y)
        if(arr[x][y-1] == 0 && !visit[x][y-1]) dfs(x,y-1)

    }
}