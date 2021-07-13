package BOJ.String

fun main() {
    var s = ""
    while(s != "#") {
        s = readLine()!!.toString()
        var answer = 0
        if(s == "#") break
        else {
            s.forEachIndexed { index, c ->
                answer += if(c == ' ') 0
                else ((index + 1 ) * (c.toInt()-64) )
            }
            println(answer)
        }
    }
}