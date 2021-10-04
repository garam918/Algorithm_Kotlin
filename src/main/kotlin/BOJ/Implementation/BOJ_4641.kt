package BOJ.Implementation

fun main() {
    while(true) {
        val s = readLine()!!.toString().split(" ")
        var count = 0
        if(s[0] == "-1") break
        else {
            s.filter { it != "0" }.forEach {
                if (s.contains((it.toInt() * 2).toString())) count++
            }
        }
        println(count)
    }
}