package BOJ.String

fun main() {
    val s = readLine()!!.toString()
    when(s[0]) {
        'A' -> {
            when(s[1]) {
                '+' -> {
                    println(4.3)
                }
                '0' -> {
                    println(4.0)
                }
                '-' -> {
                    println(3.7)
                }
            }
        }
        'B' -> {
            when(s[1]) {
                '+' -> {
                    println(3.3)
                }
                '0' -> {
                    println(3.0)
                }
                '-' -> {
                    println(2.7)
                }
            }
        }
        'C' -> {
            when(s[1]) {
                '+' -> {
                    println(2.3)
                }
                '0' -> {
                    println(2.0)
                }
                '-' -> {
                    println(1.7)
                }
            }
        }
        'D' -> {
            when(s[1]) {
                '+' -> {
                    println(1.3)
                }
                '0' -> {
                    println(1.0)
                }
                '-' -> {
                    println(0.7)
                }
            }
        }
        'F' -> {
            println(0.0)
        }
    }
}