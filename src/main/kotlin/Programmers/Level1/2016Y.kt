package Programmers.Level1

import java.time.LocalDate

fun main(){
    println(solution(1,1))
}
private fun solution(a: Int, b: Int): String {
    return LocalDate.of(2016,a,b).dayOfWeek.toString().slice(IntRange(0,2))
}