package Programmers.Level1

fun main() {
    println(solution(5, intArrayOf(2,4), intArrayOf(1,3,5)))

}

private fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
    var answer = 0

    val map = mutableMapOf<Int,Boolean>()
    val lostArray = lost.sortedArray()

    reserve.sortedArray().forEach {
        map[it] = false
    }

    repeat(n) {
        if(lostArray.contains(it+1)) {
            if(!reserve.contains(it+1)) {
                if(!lostArray.contains(it) && map.containsKey(it) && map[it] == false) {
                    answer++
                    map[it] = true
                }
                else if(!lostArray.contains(it+2)) {
                    if (map.containsKey(it) && map[it] == false) {
                        answer++
                        map[it] = true
                    }
                    else if (map.containsKey(it + 2) && map[it+2] == false) {
                        answer++
                        map[it + 2] = true
                    }
                }
            }
            else {
                answer++
                map[it+1] = true
            }
        }
        else answer++
    }

    return answer
}