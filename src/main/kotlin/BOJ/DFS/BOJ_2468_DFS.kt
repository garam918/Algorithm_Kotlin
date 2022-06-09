package BOJ.DFS

private lateinit var arr : Array<IntArray>
private lateinit var visit : Array<BooleanArray>
private var count = 0
private var currentLine = 0
private val list = arrayListOf<Int>()
private val max = arrayListOf<Int>()

fun main() {

    val n = readLine()!!.toInt()

    arr = Array(n+2) { IntArray(n+2) }
    visit = Array(n+2) { BooleanArray(n+2) { false } }

    repeat(n) {
        readLine()!!.split(" ").forEachIndexed { index, s ->
            arr[it+1][index+1] = s.toInt()
        }
    }

    repeat(arr.maxOf { it.maxOrNull()!! } + 1) {
        currentLine = it

        for(i in 1 .. n) {
            for(j in 1.. n) {
                if(!visit[i][j]) dfs(i,j)
                if(count != 0) list.add(count)
                count = 0
            }
        }
        visit = Array(n+2) { BooleanArray(n+2) { false } }
        max.add(list.size)
        list.clear()
    }

    println(max.maxOrNull()!!)

}

private fun dfs(x: Int, y:Int) {
    if (!visit[x][y] && arr[x][y] > currentLine) {
        count++
        visit[x][y] = true

        if (arr[x + 1][y] > currentLine && !visit[x + 1][y]) dfs(x + 1, y)
        if (arr[x][y + 1] > currentLine && !visit[x][y + 1]) dfs(x, y + 1)
        if (arr[x - 1][y] > currentLine && !visit[x - 1][y]) dfs(x - 1, y)
        if (arr[x][y - 1] > currentLine && !visit[x][y - 1]) dfs(x, y - 1)
    }
}