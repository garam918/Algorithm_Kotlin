package Programmers.Level1

fun main() {
    solution(intArrayOf(1,5,2,6,3,7,4), arrayOf(intArrayOf(2,5,3), intArrayOf(4,4,1), intArrayOf(1,7,3)))
}

private fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
    var answer = intArrayOf()

    repeat(commands.size) {
        answer += array.sliceArray(IntRange(commands[it][0]-1,commands[it][1]-1)).sortedArray()[commands[it][2]-1]
    }

    return answer
}