package BOJ

import java.util.*
import kotlin.collections.ArrayList

private lateinit var map : Array<IntArray>
private lateinit var visit : Array<BooleanArray>

private var danjiArrayList : ArrayList<Int> = ArrayList()

private var n = 0

private val dx = intArrayOf(1,0,-1,0)
private val dy = intArrayOf(0,1,0,-1)

fun main(){
    n = readLine()!!.toInt()
    map = Array(n) { IntArray(n) }
    visit = Array(n) {BooleanArray(n) {false} }

    for (m in 0 until n) {
        val k : String = readLine()!!
        for (i in 0 until n) {
            map[m][i] = k[i].toString().toInt()
        }

    }

    for (ii in 0 until n) {
        for (jj in 0 until n) {
            if (map[ii][jj] == 1 && !visit  [ii][jj]){
                bfs(ii,jj)
            }
        }
    }
    danjiArrayList.sort()

    println(danjiArrayList.size)
    for (i in danjiArrayList) {
        println(i)
    }
}


private fun bfs(x: Int, y: Int) {
    val qux : Queue<Int> = LinkedList()
    val quy : Queue<Int> = LinkedList()

    qux.offer(x)
    quy.offer(y)

    var xxx : Int
    var yyy : Int

    var count = 1

    while(!qux.isEmpty() && !quy.isEmpty()) {
        xxx = qux.poll()
        yyy = quy.poll()
        visit[xxx][yyy] = true

        for (i in 0 until 4) {
            val _x = xxx + dx[i]
            val _y = yyy + dy[i]

            if (_x >= 0 && _y >= 0 && _x < n && _y < n){
                if (map[_x][_y] == 1 && !visit[_x][_y]){
                    qux.add(_x)
                    quy.add(_y)
                    visit[_x][_y] = true
                    count++
                }
            }

        }

    }
    danjiArrayList.add(count)
}
