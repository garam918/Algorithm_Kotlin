package Programmers.Level1

fun main() {
    println(solution(arrayOf("sun", "bed", "car"),1).toList())
}
private fun solution(strings: Array<String>, n: Int): Array<String> {

    strings.sortWith( compareBy ({ it[n] } , {it}))

    return strings
}

