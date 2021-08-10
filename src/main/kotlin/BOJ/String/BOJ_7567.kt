package BOJ.String

fun main() {
    var h = 0
    val s = readLine()!!.toString()

    s.forEachIndexed { index, c ->
        h += if(index == 0) 10
        else {
            if(s[index-1] != c) 10
            else 5
        }
    }
    println(h)
}