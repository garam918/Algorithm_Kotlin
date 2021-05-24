package BOJ.String

fun main() {
    var s: String
    while(true){
        s = readLine()!!.toString()
        if(s == "END") break
        println(s.reversed())
    }
}