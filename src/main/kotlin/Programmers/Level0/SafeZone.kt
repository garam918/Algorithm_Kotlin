package Programmers.Level0

fun main() {

    val board = arrayOf(intArrayOf(0,0,0,0,0),intArrayOf(0,0,0,0,0),intArrayOf(0,0,0,0,0)
    ,intArrayOf(0,0,1,1,0),intArrayOf(0,0,0,0,0))

    println(solution(board))

}

private fun solution(board: Array<IntArray>): Int {
    var answer = 0

    val tempArr = Array(board.size+2) { IntArray (board[0].size+2) { 9 } }
    board.forEachIndexed { index, ints ->
        ints.forEachIndexed { ind, i ->
            tempArr[index + 1][ind + 1] = i
        }
    }

    board.forEachIndexed { index, ints ->
        ints.forEachIndexed { ind, i ->
            if(i == 1) {
                tempArr[index+2][ind+1] = 9
                tempArr[index+1][ind+2] = 9
                tempArr[index][ind+1] = 9
                tempArr[index+1][ind] = 9
                tempArr[index][ind+2] = 9
                tempArr[index+2][ind+2] = 9
                tempArr[index+2][ind] = 9
                tempArr[index][ind] = 9

            }
        }
    }

    tempArr.forEach { ints ->
        ints.forEach { if(it == 0) answer++ }
    }

    return answer
}