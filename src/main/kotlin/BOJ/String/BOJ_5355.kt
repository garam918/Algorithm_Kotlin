package BOJ.String

fun main() = repeat(readLine()!!.toInt()) {
        val s = readLine()!!.toString().split(" ")
        var a = s[0].toDouble()

        repeat(s.size-1) {
            when {
                s[it+1] == "@" -> {
                    a *= 3
                }
                s[it+1] == "%" -> {
                    a += 5
                }
                s[it+1] == "#" -> {
                    a -= 7
                }

            }
        }
        println(String.format("%.2f",a))
    }
