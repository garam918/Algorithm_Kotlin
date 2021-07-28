package BOJ.String

fun main() {
    var t = 1
    loop@while(true) {
        val s = readLine()!!.toString().split(" ")
        val a = s[0].toInt()
        val b = s[2].toInt()

        val pr = "Case $t:"
        when (s[1]) {
            ">" -> {
                if(a <= b) println("$pr false")
                else println("$pr true")
            }
            ">=" -> {
                if(a < b) println("$pr false")
                else println("$pr true")
            }
            "<" -> {
                if(a >= b) println("$pr false")
                else println("$pr true")
            }
            "<=" -> {
                if(a > b) println("$pr false")
                else println("$pr true")
            }
            "==" -> {
                if(a != b) println("$pr false")
                else println("$pr true")
            }
            "!=" -> {
                if(a == b) println("$pr false")
                else println("$pr true")
            }
            "E" -> {
                break@loop
            }
        }
        t++
    }
}