package BOJ.Implementation

fun main() {

    val aList = mutableListOf<Int>()
    val bList = mutableListOf<Int>()
    var aScore = 0
    var bScore = 0
    var lastWin = ""

    repeat(2) {
        val input = readLine()!!.toString().split(" ")
        if(it == 0) {
            input.forEach {
                aList.add(it.toInt())
            }
        }
        else {
            input.forEach {
                bList.add(it.toInt())
            }
        }
    }

    aList.forEachIndexed { index, i ->
        when {
            i > bList[index] -> {
                aScore += 3
                lastWin = "A"
            }
            i == bList[index] -> {
                aScore += 1
                bScore += 1
            }
            i < bList[index] -> {
                bScore += 3
                lastWin = "B"
            }
        }
    }

    println("$aScore $bScore")
    when {
        aScore > bScore -> println("A")
        aScore == bScore -> {
            if (lastWin == "") println("D")
            else println(lastWin)
        }
        aScore < bScore -> println("B")
    }
}