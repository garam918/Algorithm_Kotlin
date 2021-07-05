package BOJ.String

fun main() {
    val a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    var s = ""
    while(s != "#") {
        var count = 0
        s = readLine()!!.toString().toUpperCase()
        if (s == "#") break
        else {
            a.forEachIndexed { index, c ->
                if(s.contains(c)) {
                    count++
                }
            }
        }
        println(count)
    }
}