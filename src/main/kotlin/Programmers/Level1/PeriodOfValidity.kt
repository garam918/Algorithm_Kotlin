package Programmers.Level1

fun main() = println(solution("2020.01.01",arrayOf("Z 3","D 5"),
    arrayOf("2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z")).toList())

private fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
    var answer = intArrayOf()

    val termMap = mutableMapOf<String,Int>()
    terms.forEach { termMap[it.split(" ")[0]] = it.split(" ")[1].toInt() }

    privacies.forEachIndexed { index, s ->
        val str = s.split(" ")
        val date = str[0].split(".")
        val type = str[1]

        var year = date[0].toInt()
        var month = date[1].toInt()
        var day = date[2].toInt()

        val today = today.split(".")
        val todayYear = today[0].toInt()
        val todayMonth = today[1].toInt()
        val todayDay = today[2].toInt()

        val validity = termMap[type]!!.toInt()

        when {
            validity > 12 -> {
                year += validity / 12
                if((month + (validity % 12)) > 12) {
                    year++
                    month = month + (validity % 12) - 12
                }
                else month += (validity % 12)
            }

            validity + month > 12 -> {
                year += (validity + month) / 12
                month = (validity + month) - 12
            }

            else -> month += validity
        }

        if(day == 1) {
            day = 28
            if(month != 1) month--
            else {
                year--
                month = 12
            }
        }
        else day--

        when {
            todayYear == year -> {
                when {
                    todayMonth == month -> if(todayDay > day) answer += index + 1
                    todayMonth > month -> answer += index + 1
                }
            }
            todayYear > year -> answer += index + 1
        }
    }

    return answer
}