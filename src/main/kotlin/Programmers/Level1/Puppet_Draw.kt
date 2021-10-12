package Programmers.Level1

fun main() {
    println(solution(arrayOf(intArrayOf(0,0,0,0,0),intArrayOf(0,0,1,0,3),intArrayOf(0,2,5,0,1),intArrayOf(4,2,4,4,2)
    ,intArrayOf(3,5,1,3,1)), intArrayOf(1,5,3,5,1,2,1,4)))
}

private fun solution(board: Array<IntArray>, moves: IntArray): Int {
    var answer = 0

    val bucket = mutableListOf<Int>()

    repeat(moves.size) {
        for(i in board.indices) {
            if(board[i][moves[it]-1] != 0) {
                if(bucket.isEmpty() || bucket.last() != board[i][moves[it]-1]) {
                    bucket.add(board[i][moves[it]-1])
                    board[i][moves[it]-1] = 0
                    break
                } else {
                    answer += 2
                    board[i][moves[it]-1] = 0
                    bucket.removeAt(bucket.lastIndex)
                    break
                }
            }
        }
    }
    return answer
}