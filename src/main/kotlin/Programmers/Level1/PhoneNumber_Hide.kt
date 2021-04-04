package Programmers.Level1

fun main() {
    solution("027778888")
}

private fun solution(phone_number: String): String {
    var answer = ""

    val list = ArrayList<Char>(phone_number.length)

    repeat(phone_number.length) {
        list.add(phone_number[it])
    }

    repeat(list.size-4) {
        list[it] = '*'
    }

    repeat(list.size) {
        answer += list[it]
    }

    println(answer)

    return answer
}