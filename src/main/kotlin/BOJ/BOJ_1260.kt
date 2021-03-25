package BOJ

import java.util.*

private lateinit var bfs_visit : BooleanArray
private lateinit var dfs_visit : BooleanArray
private lateinit var arr1 : Array<IntArray>

fun main() {
    val input  = readLine()!!.split(" ")

    var n : Int
    var m : Int
    var v : Int
    var x : Int
    var y : Int

    n = input[0].toInt()
    m = input[1].toInt()
    v = input[2].toInt()

    arr1 = Array(n+1) {IntArray(n+1)}
    bfs_visit = BooleanArray(n+1)
    dfs_visit = BooleanArray(n+1)

    for (i in 0 until m) {
        val input2 = readLine()!!.split(" ")
        x = input2[0].toInt()
        y = input2[1].toInt()

        arr1[x][y] = 1
        arr1[y][x] = 1
    }

    dfs(v)
    println()
    bfs(v)

}


private fun bfs(start: Int) {
    val queue : Queue<Int> = LinkedList()

    queue.offer(start)
    bfs_visit[start] = true

    while (!queue.isEmpty()) {
        var x = queue.peek()
        queue.poll()
        print("$x ")
        for (i in 0 until arr1[x].size){
            if(arr1[x][i] == 1 && !bfs_visit[i]){
                queue.offer(i)
                bfs_visit[i] = true
            }
        }
    }


}

private fun dfs(x: Int) {
    if(dfs_visit[x]) return
    dfs_visit[x] = true

    print("$x ")

    for(i in 0 until arr1[x].size ) {
        if(arr1[x][i] == 1 && !dfs_visit[i]) {
            dfs(i)
        }
    }

}