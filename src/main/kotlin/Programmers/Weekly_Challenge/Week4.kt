package Programmers.Weekly_Challenge

fun main () {

    println(solution(arrayOf("SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"),
    arrayOf("JAVA", "JAVASCRIPT"), intArrayOf(7,5)))

}
fun solution(table: Array<String>, languages: Array<String>, preference: IntArray): String {
    var answer = ""

    val type = MutableList(5) { ScoreData("",0) }
    val score = IntArray(5)

    repeat(table.size) {
        var count = 0
        table[it].split(" ").reversed().forEachIndexed { index, s ->
            if(index != 5) {
                languages.forEachIndexed { i, str ->
                    if (str == s) {
                        count += (index + 1) * preference[i]
                        score[it] = count
                    }
                }
            } else type[it] = ScoreData(s,score[it])

        }

    }

    answer = type.sortedWith(compareBy ( {it.score} , {it.name} )).maxWithOrNull(compareBy { it.score })?.name.toString()

    return answer
}
data class ScoreData(
        val name : String,
        val score : Int)