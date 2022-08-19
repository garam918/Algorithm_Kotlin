package Programmers.Level1

fun main() {

    println(solution(arrayOf("TR", "RT", "TR"), intArrayOf(7,1,3)))

}

private fun solution(survey: Array<String>, choices: IntArray): String {
    var answer = ""

    val map = mutableMapOf("R" to 0, "T" to 0, "C" to 0, "F" to 0, "J" to 0, "M" to 0, "A" to 0, "N" to 0)

    choices.forEachIndexed { index, i ->
        val first = survey[index].first().toString()
        val last = survey[index].last().toString()
        when(i) {
            1 -> map[first] = map[first]!! + 3
            2 -> map[first] = map[first]!! + 2
            3 -> map[first] = map[first]!! + 1
            5 -> map[last] = map[last]!! + 1
            6 -> map[last] = map[last]!! + 2
            7 -> map[last] = map[last]!! + 3
        }
    }

    answer += mapToStr(map["R"]!!,map["T"]!!,'R','T')
    answer += mapToStr(map["C"]!!,map["F"]!!,'C','F')
    answer += mapToStr(map["J"]!!,map["M"]!!,'J','M')
    answer += mapToStr(map["A"]!!,map["N"]!!,'A','N')

    return answer
}

private fun mapToStr(fir : Int, sec : Int, firName: Char, secName: Char): Char = when{
    fir > sec -> firName
    fir < sec -> secName
    else -> {
        if (firName.code > secName.code) secName
        else firName
    }
}