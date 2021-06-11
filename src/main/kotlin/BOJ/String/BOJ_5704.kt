package BOJ.String

fun main() {
    val al = "abcdefghijklmnopqrstuvwxyz"

    while(true) {
        var answer = "Y"
        val tc = readLine()!!
        if(tc == "*") break
        else {
            al.forEachIndexed { index, c ->
                if( !tc.contains(c) ) answer = "N"
            }

        }
        println(answer)
    }
}