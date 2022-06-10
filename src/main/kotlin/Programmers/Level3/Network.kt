package Programmers.Level3

fun main() {
    println(solution(3, arrayOf(intArrayOf(1,1,0),intArrayOf(1,1,0),intArrayOf(0,0,1))))
}

private lateinit var visit : BooleanArray
private lateinit var arr : Array<IntArray>
private lateinit var lineList : ArrayList<MutableList<Int>>
private var list = mutableListOf<Int>()
private var count = 0

private fun solution(n: Int, computers: Array<IntArray>): Int {

    arr = Array(n+2) { IntArray(n+2) { 0 } }
    visit = BooleanArray(n+2) { false }
    lineList = arrayListOf()

    computers.forEachIndexed { index, ints ->

        ints.forEachIndexed { i, it ->
            if(index+1 != i+1 && it == 1) arr[index+1][i+1] = 1
        }
    }

    repeat(n) {
        if(!visit[it+1]) {
            dfs(it+1)
            count++
            lineList.add(list)
            list = mutableListOf()

        }
    }

    return lineList.size
}

private fun dfs(x: Int) {
    if(!visit[x]) {
        visit[x] = true
        list.add(x)

        for(i in 1 until arr.size) if(arr[x][i] == 1 && !visit[i]) dfs(i)
    }
}