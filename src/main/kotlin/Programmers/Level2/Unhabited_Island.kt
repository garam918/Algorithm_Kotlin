package Programmers.Level2

fun main() = println(solution(arrayOf("X4X","1XX","X9X","XXX")).toList())

private lateinit var arr : Array<Array<String>>
private lateinit var visit : Array<BooleanArray>
private var days = 0

private fun solution(maps: Array<String>): IntArray {
    var answer: IntArray = intArrayOf()

    arr = Array(maps.size+2) { Array(maps[0].length+2) { "" } }
    visit = Array(maps.size+2) { BooleanArray(maps[0].length+2) }

    maps.forEachIndexed { index, s -> s.forEachIndexed { ind, c ->
        arr[index+1][ind+1] = c.toString()
    } }

    for(i in 1 .. maps.size) {
        for(j in 1 .. maps[0].length) {
            if(!visit[i][j] && arr[i][j].isNotEmpty() && arr[i][j] != "X") {
                dfs(i,j)

                if(days != 0) answer += days
                days = 0
            }
        }
    }
    if(answer.isEmpty()) answer += -1

    return answer.sortedArray()
}

private fun dfs(x: Int, y: Int) {
    if(!visit[x][y]) {

        if(arr[x][y] != "X" && arr[x][y].isNotEmpty()) days += arr[x][y].toInt()
        visit[x][y] = true

        if(arr[x+1][y] != "X" && arr[x+1][y] != "" && !visit[x+1][y]) dfs(x+1,y)
        if(arr[x][y+1] != "X" && arr[x][y+1] != "" && !visit[x][y+1]) dfs(x,y+1)
        if(arr[x-1][y] != "X" && arr[x-1][y] != "" && !visit[x-1][y]) dfs(x-1,y)
        if(arr[x][y-1] != "X" && arr[x][y-1] != "" && !visit[x][y-1]) dfs(x,y-1)
    }
}