package Programmers.Level1

fun main() {
    println(solution(intArrayOf(4,7,12), booleanArrayOf(true,false,true)))
}

private fun solution(absolutes: IntArray, signs: BooleanArray): Int {

    val array = IntArray(signs.size)
    repeat(signs.size) {
        if(signs[it]) array[it] = absolutes[it]
        else array[it] = -(absolutes[it])
    }

    return array.sum()
}