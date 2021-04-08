package Programmers.Level1

fun main() {
    println(solution(626331))
}

private fun solution(num: Int): Int {
    var answer = 0

    var n = num

    loop@
    while(n != 1) {

        when {
            n % 2 == 0 -> {
                n /= 2
                answer++
            }
            n % 2 == 1 -> {

                if(((n.toLong()*3) +1) > Int.MAX_VALUE ) {
                    answer = -1
                    break@loop
                }
                else {
                    n = n*3 +1
                    answer++
                }

            }
            n == 1 -> {
                break@loop
            }
        }
    }

    return answer
}