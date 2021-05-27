package BOJ.String

fun main() {
    var tc = 1
    while(tc != 0) {
        tc = readLine()!!.toInt()
        if(tc == 0) break
        if(tc.toString() == tc.toString().reversed()) println("yes")
        else println("no")
    }
}