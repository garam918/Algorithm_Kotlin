package BOJ.DFS

import kotlin.math.pow

private lateinit var arr : Array<CharArray>
private lateinit var visit : Array<BooleanArray>

private var bCount = 0
private val bList = mutableListOf<Int>()

private var wCount = 0
private val wList = mutableListOf<Int>()

private var currentChar = ' '

fun main() {

    val nm = readLine()!!.split(" ")
    val n = nm[0].toInt()
    val m = nm[1].toInt()

    arr = Array(m+2) { CharArray(n+2) }
    visit = Array(m+2) { BooleanArray(n+2) }


    repeat(m) {
        readLine()!!.forEachIndexed { index, c ->
            arr[it+1][index+1] = c
        }
    }

    for(i in 1 .. m) {
        for(j in 1 .. n) {
            dfs(i,j)
            if(bCount != 0) bList.add(bCount)
            bCount = 0

            if(wCount != 0) wList.add(wCount)
            wCount = 0

        }

    }
    var bPower = 0
    var wPower = 0

    bList.forEach {
        bPower += it.toDouble().pow(2.toDouble()).toInt()
    }

    wList.forEach {
        wPower += it.toDouble().pow(2.toDouble()).toInt()
    }

    println("$wPower $bPower")

}

private fun dfs(x:Int, y:Int) {
    if (!visit[x][y]) {
        visit[x][y] = true

        currentChar = arr[x][y]

        if(currentChar == 'B') bCount++
        else wCount++

        if(arr[x+1][y] == currentChar && !visit[x+1][y]) dfs(x+1,y)
        if(arr[x][y+1] == currentChar && !visit[x][y + 1]) dfs(x, y + 1)
        if(arr[x-1][y] == currentChar && !visit[x - 1][y]) dfs(x - 1, y)
        if(arr[x][y-1] == currentChar && !visit[x][y - 1]) dfs(x, y - 1)
    }
}