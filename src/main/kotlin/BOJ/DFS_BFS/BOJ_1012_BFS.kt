package BOJ

import java.util.*

private lateinit var map : Array<IntArray>
private lateinit var visit : Array<BooleanArray>
private var x = 0
private var y = 0

private var m = 0
private var n = 0

private val dx = intArrayOf(1,0,-1,0)
private val dy = intArrayOf(0,1,0,-1)

fun main(){
    val st = readLine()
    val t = st!!.toInt()
    var count: Int

    for (i in 0 until t){
        val st = readLine()!!.split(" ")
        m = st[0].toInt()
        n = st[1].toInt()
        val k = st[2].toInt()

        map = Array(m+1) { IntArray(n + 1) }
        visit = Array(m+1){ BooleanArray(n+1){ false} }
        count = 0

        for (j in 0 until k) {
            val st = readLine()!!.split(" ")
            x = st[0].toInt()
            y = st[1].toInt()

            map[x][y] = 1
        }

        for(ii in 0 until m) {
            for (jj in 0 until n) {
                if(map[ii][jj] == 1 && !visit[ii][jj]){
                    bfs(ii, jj)
                    count++
                }
            }
        }

        println(count)
    }
}

private fun bfs(x: Int, y: Int){
    val qux : Queue<Int> = LinkedList()
    val quy : Queue<Int> = LinkedList()

    qux.offer(x)
    quy.offer(y)

    var xxx: Int
    var yyy: Int

    while(!qux.isEmpty() && !quy.isEmpty()){
        xxx = qux.poll()
        yyy = quy.poll()
        visit[xxx][yyy] = true

        for(i in 0 until 4) {
            val _x = xxx + dx[i]
            val _y = yyy + dy[i]

            if(_x >= 0 && _y >= 0 && _x < m && _y < n){
                if (map[_x][_y] == 1 && !visit[_x][_y]) {
                    qux.add(_x)
                    quy.add(_y)
                    visit[_x][_y] = true
                }
            }
        }

    }
}