package BOJ.String

fun main() {

    val vowel = arrayOf('A','E','I','O','U','a','e','i','o','u')

    repeat(readLine()!!.toInt()) {
        var vCount = 0
        var cCount = 0

        readLine()!!.toString().onEachIndexed { index, c ->
            if( vowel.contains(c) ) vCount++
            else if (c != ' ') cCount++
        }
        println("$cCount $vCount")

    }
}