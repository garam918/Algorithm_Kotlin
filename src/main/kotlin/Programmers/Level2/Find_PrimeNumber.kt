package Programmers.Level2

fun main() {
    println(solution("011"))

}
private fun solution(numbers: String): Int {
    var answer = 0

    val list = mutableSetOf<Int>()

    combination(numbers,"",list)

    list.forEach {
        if(it != 1 && it != 0) {

            var check = true

            for (i in 2 until it) {
                if (it % i == 0) {
                    check = false
                    break
                }
            }
            if (check) answer++
        }
    }

    return answer
}

private fun combination(number : String, str : String, set : MutableSet<Int>) {
    val len = number.length

    if(str.isNotBlank()) set.add(str.toInt())

    for(i in 0 until len) {
        combination(number.substring(0,i) + number.substring(i+1, len),str +
        number[i],set)
    }
}