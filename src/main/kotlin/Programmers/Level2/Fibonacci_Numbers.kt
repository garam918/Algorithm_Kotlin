package Programmers.Level2

fun main() {
    println(solution(9999))
}
private var array = LongArray(100000000)

private fun solution(n: Int): Long {
    var answer : Long

    answer = fibonacci(n)

    return answer
}

private fun fibonacci(n: Int) : Long{
    if(n == 1) return 1
    if(n == 2) return 1
    if(n == 3) return 2
    if(array[n] != 0.toLong()) return array[n] % 1234567

    array[n] = (fibonacci(n-1) % 1234567) + (fibonacci(n-2) % 1234567)

    return (array[n] % 1234567)
}