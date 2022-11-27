package Programmers.Level2

fun main() {

    val want = arrayOf("banana", "apple", "rice", "pork", "pot")
    val number = intArrayOf(3,2,2,2,1)
    val discount = arrayOf("chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana")

    println(solution(want,number,discount))
}

private fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
    var answer = 0
    val map = hashMapOf<String,Int>()
    var bool: Boolean
    for(i in 0 .. discount.size-10) {
        map.clear()
        bool = true

        for(j in i until (i + 10)) {
            if(map.containsKey(discount[j])) map[discount[j]] = map[discount[j]]!! + 1
            else map[discount[j]] = 1
        }
        want.forEachIndexed { index, it ->
            if(!map.containsKey(it) || (map[it]!! < number[index])) bool = false
        }
        if(bool) answer++
    }

    return answer
}