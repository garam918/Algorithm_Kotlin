package BOJ.DFS

private lateinit var arr : Array<Array<String>>
private lateinit var visit: Array<BooleanArray>
private var count = 0
private var currentChar = ""

fun main() {

    val (nm1, nm2) = readLine()!!.split(" ")

    val n = nm1.toInt()
    val m = nm2.toInt()

    arr = Array(n+2) { Array(m+2) { "" } }
    visit = Array(n+2) { BooleanArray(m+2) }

    repeat(n) { i ->
        readLine()!!.forEachIndexed { index, s ->
            arr[i+1][index+1] = s.toString()
        }
    }

    for(i in 1 .. n) {
        for(j in 1 .. m) {

            if(!visit[i][j]) {
                dfs(i,j)

                count++
                currentChar = ""

            }
        }
    }

    println(count)
}

private fun dfs(x : Int, y:Int) {
    if(arr[x][y] != "" && !visit[x][y]) {
        visit[x][y] = true

        currentChar = arr[x][y]

        if(currentChar == "-") {
            if (arr[x][y+1] == currentChar && !visit[x][y+1]) dfs(x, y+1)
        }
        else if (arr[x+1][y] == currentChar && !visit[x+1][y]) dfs(x+1, y)
    }
}