package BOJ.DFS

private lateinit var visit : Array<BooleanArray>
private lateinit var arr : Array<IntArray>
private val danji = arrayListOf<Int>()

private var n = 0
private var count = 0

fun main() {
    n = readLine()!!.toInt()

    arr = Array(n +2) { IntArray(n +2) }
    visit = Array(n +2) { BooleanArray(n +2) {false} }

    for(i in 1 .. n) {
        val k = readLine()!!

        for (m in 1 .. n) {
            arr[i][m] = k[m-1].toString().toInt()
        }
    }

    for(i in 1 .. n){
        for(j in 1 .. n) {
            if(arr[i][j] == 1 && !visit[i][j]) {
                dfs(i,j)
                danji.add(count)
                count = 0
            }

        }
    }
    println(danji.size)
    danji.sorted().forEach {
        println(it)
    }
}

private fun dfs(x: Int, y: Int) {
    visit[x][y] = true
    count++

    if(arr[x+1][y] == 1 && !visit[x+1][y]) dfs(x+1,y)
    if(arr[x][y+1] == 1 && !visit[x][y+1]) dfs(x,y+1)
    if(arr[x-1][y] == 1 && !visit[x-1][y]) dfs(x-1,y)
    if(arr[x][y-1] == 1 && !visit[x][y-1]) dfs(x,y-1)

}