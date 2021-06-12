package BOJ.String

fun main() {
    while(true) {
        val s = readLine()!!

        if(s == "#") break

        val al = s.split(" ")[0]

        var count = 0

        s.forEachIndexed { index, c ->
            if(c.toLowerCase().toString() == al) count++
        }
        println("$al ${count-1}")
    }
}