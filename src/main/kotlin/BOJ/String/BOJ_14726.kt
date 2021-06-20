package BOJ.String

fun main() = repeat(readLine()!!.toInt()) {
    var temp = ""
    readLine()!!.toString().forEachIndexed { index, c ->
        if(index % 2 == 0) {
            val even = (c.toString().toInt() * 2)
            temp += if( even >= 10 ) {
                even.toString()[0].toString().toInt() + even.toString()[1].toString().toInt()
            } else {
                even
            }
        }
        else {
            temp += c
        }
    }

    var answer = 0

    temp.forEachIndexed { index, c ->
        answer += c.toString().toInt()
    }
    if(answer % 10 == 0) println("T")
    else println("F")
}