package BOJ.String

fun main() {

    var answer = 0

    val s = readLine()!!.toString()

    repeat(s.length) {

        when{
            "ABC".contains(s[it]) -> {
                answer += 3
            }
            "DEF".contains(s[it]) -> {
                answer += 4
            }
            "GHI".contains(s[it]) -> {
                answer += 5
            }
            "JKL".contains(s[it]) -> {
                answer += 6
            }
            "MNO".contains(s[it]) -> {
                answer += 7
            }
            "PQRS".contains(s[it]) -> {
                answer += 8
            }
            "TUV".contains(s[it]) -> {
                answer += 9
            }
            "WXYZ".contains(s[it]) -> {
                answer += 10
            }

        }
    }

    println(answer)

}