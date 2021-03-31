package Programmers

fun main() {
    solution(4)
}

private fun solution(n: Int): String {
    var answer = ""

    val arrayList = ArrayList<String> ()

    for(i in 1 .. n) {
        when(i % 2) {
            0 -> {
                arrayList.add("박")
            }

            1 -> {
                arrayList.add("수")
            }
        }
    }

    answer = arrayList.joinToString().replace(",","").replace(" ","")

    return answer
}