package BOJ.DFS

private lateinit var arr : Array<IntArray>
private lateinit var visit : Array<BooleanArray>

private var count = 0
private val landCount = arrayListOf<Int>()

fun main() {

    while (true) {
        val wh = readLine()!!
        if(wh == "0 0") break
        else {
            val w = wh.split(" ")[0].toInt()
            val h = wh.split(" ")[1].toInt()

            arr = Array(h+2) { IntArray(w+2) }
            visit = Array(h+2) { BooleanArray(w+2) {false} }

            for(i in 1 .. h) {

                val width = readLine()!!.split(" ")

                for(j in 1 .. w) {
                    arr[i][j] = width[j-1].toInt()
                }

            }

            for(k in 1 .. h) {
                for(l in 1 .. w) {
                    if(arr[k][l] == 1 && !visit[k][l]) {
                        dfs(k,l)
                        landCount.add(count)
                    }
                }
            }
            count = 0
            println(landCount.size)
            landCount.clear()

        }
    }
}

private fun dfs(x: Int, y: Int) {
    visit[x][y] = true
    count++

    if (arr[x + 1][y] == 1 && !visit[x + 1][y]) dfs(x + 1, y)
    if (arr[x][y + 1] == 1 && !visit[x][y + 1]) dfs(x, y + 1)
    if (arr[x - 1][y] == 1 && !visit[x - 1][y]) dfs(x - 1, y)
    if (arr[x][y - 1] == 1 && !visit[x][y - 1]) dfs(x, y - 1)

    if (arr[x+1][y+1] == 1 && !visit[x+1][y+1]) dfs(x+1,y+1)
    if (arr[x-1][y-1] == 1 && !visit[x-1][y-1]) dfs(x-1,y-1)
    if (arr[x+1][y-1] == 1 && !visit[x+1][y-1]) dfs(x+1,y-1)
    if (arr[x-1][y+1] == 1 && !visit[x-1][y+1]) dfs(x-1,y+1)

}