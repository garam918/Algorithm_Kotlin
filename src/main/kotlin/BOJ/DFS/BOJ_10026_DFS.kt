package BOJ.DFS

private lateinit var arr : Array<CharArray>
private lateinit var visit : Array<BooleanArray>
private val colorList = arrayListOf<Int>()
private var currentChar = '0'
private var count = 0

private lateinit var rgArr : Array<CharArray>
private lateinit var rgVisit : Array<BooleanArray>
private val rgColorList = arrayListOf<Int>()
private var rgCount = 0
private var rgCurrentChar = '0'

fun main() {

    val n = readLine()!!.toInt()

    arr = Array(n+2) { CharArray(n+2) }
    rgArr = Array(n+2) { CharArray(n+2) }
    visit = Array(n+2) { BooleanArray( n+2) { false } }
    rgVisit = Array(n+2) { BooleanArray(n+2) { false } }

    repeat(n) {
        val s = readLine()!!

        s.forEachIndexed { index, c ->
            arr[it+1][index+1] = c
            if(c != 'B') rgArr[it+1][index+1] = 'R'
            else rgArr[it+1][index+1] = c
        }
    }

    for (i in 1 .. n) {
        for(j in 1 .. n) {
            dfs(i,j)
            if(count != 0) colorList.add(count)
            count = 0

            rgDfs(i,j)
            if(rgCount != 0) rgColorList.add(rgCount)
            rgCount = 0
        }
    }

    println("${colorList.size} ${rgColorList.size}")
}

private fun dfs(x: Int, y: Int) {
    if(!visit[x][y]) count++
    visit[x][y] = true
    currentChar = arr[x][y]

    if(arr[x+1][y] == currentChar && !visit[x+1][y]) dfs(x+1,y)
    if(arr[x][y+1] == currentChar && !visit[x][y+1]) dfs(x,y+1)
    if(arr[x-1][y] == currentChar && !visit[x-1][y]) dfs(x-1,y)
    if(arr[x][y-1] == currentChar && !visit[x][y-1]) dfs(x,y-1)

}

private fun rgDfs(x:Int, y:Int) {
    if(!rgVisit[x][y]) rgCount++
    rgVisit[x][y] = true
    rgCurrentChar = rgArr[x][y]

    if(rgArr[x+1][y] == rgCurrentChar && !rgVisit[x+1][y]) rgDfs(x+1,y)
    if(rgArr[x][y+1] == rgCurrentChar && !rgVisit[x][y+1]) rgDfs(x,y+1)
    if(rgArr[x-1][y] == rgCurrentChar && !rgVisit[x-1][y]) rgDfs(x-1,y)
    if(rgArr[x][y-1] == rgCurrentChar && !rgVisit[x][y-1]) rgDfs(x,y-1)
}