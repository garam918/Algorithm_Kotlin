package BOJ.String

fun main() = repeat(readLine()!!.toInt()) {
    var s = readLine()!!.toString()
    var count = 0
    while(s != "6174") {
        if(s == "6174") break
        var a = ""
        var b = ""

        s.toList().sortedByDescending { it }.onEachIndexed { index, c ->
            a += c
        }
        s.toList().sortedBy { it }.onEachIndexed { index, c ->
            b += c
        }
        s = (a.toInt() - b.toInt()).toString()
        when(s.length) {
            3 -> {
                s = "0".plus(s)
            }

            2 -> {
                s = "00".plus(s)
            }

            1 -> {
                s = "000".plus(s)
            }

        }
        count++
    }
    println(count)
}