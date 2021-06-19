package BOJ.String

fun main() {
    val s = readLine()!!.toString().split("(^0^)")
    val left = s[0]
    val right = s[1]

    var lCount = 0
    var rCount = 0

    left.forEachIndexed { index, c ->
        if(c == '@') lCount++
    }
    right.forEachIndexed { index, c ->
        if(c == '@') rCount++
    }

    println("$lCount $rCount")
}