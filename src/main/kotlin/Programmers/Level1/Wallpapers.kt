package Programmers.Level1

import kotlin.math.max
import kotlin.math.min

fun main() = println(solution(arrayOf("..........", ".....#....", "......##..", "...##.....", "....#.....")).toList())

private fun solution(wallpaper: Array<String>): IntArray {
    var answer: IntArray = intArrayOf()

    var xMin = 52
    var yMin = 52
    var xMax = -1
    var yMax = -1

    wallpaper.forEachIndexed { index, s ->
        s.forEachIndexed { ind, c ->
            if(c == '#') {
                xMin = min(index,xMin)
                yMin = min(ind,yMin)
                xMax = max(index,xMax)
                yMax = max(ind,yMax)
            }
        }
    }

    answer += xMin
    answer += yMin
    answer += xMax + 1
    answer += yMax + 1

    return answer
}