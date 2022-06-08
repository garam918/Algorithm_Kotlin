package BOJ.BFS

import java.util.*

fun main(){
    val input = readLine()
    val input2 = readLine()
    val a = input!!.toInt()
    val b = input2!!.toInt()
    var c = 0
    val map = Array(a+1) { IntArray(a + 1) }
    val visit = Array(a+1){ false }

    for (m in 0 until b) {
        val st = readLine()!!.split(" ")
        val start = st[0].toInt()
        val end = st[1].toInt()
        map[start][end] = 1
        map[end][start] = 1
    }

    val q : Queue<Int> = LinkedList()
    q.offer(1)

    while (!q.isEmpty()) {
        val x = q.poll()

        for ( i in 0 .. a ){
            if (map[x][i] == 1 && !visit[i]!!){
                q.offer(i)
                visit[i] = true
                c++
            }
        }

    }
    println(c-1)
}