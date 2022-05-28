package BOJ.String

fun main() {

    while(true) {
        var lower = 0
        var upper = 0
        var num = 0
        var space = 0

        val s = readLine()

        if(s == "null" || s.isNullOrBlank()) break
        else {
            s.forEach { c ->
                when {
                    c.isLowerCase() -> {
                        lower++
                    }
                    c.isUpperCase() -> {
                        upper++
                    }
                    c.isDigit() -> {
                        num++
                    }
                    c.isWhitespace() -> {
                        space++
                    }
                }
            }
            println("$lower $upper $num $space")
        }
    }
}