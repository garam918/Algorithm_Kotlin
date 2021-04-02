package Programmers.Level1

fun main() {
    solution(118372)
}

private fun solution(n: Long): Long {
    var answer: Long = 0

    var s = n.toString()
    var t = ""
    val arrayList = ArrayList<Char>(s.length)

    for (i in s.indices) {
        arrayList.add(s[i])
    }

    arrayList.sortDescending()
    repeat(arrayList.size) {
        t += arrayList[it]
    }

    answer = t.toLong()

    return answer
}