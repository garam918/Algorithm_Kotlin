package BOJ.String

fun main() {
    val v = readLine()!!.toInt()
    val s = readLine()!!.toString()

    var aCount = 0
    var bCount = 0
    repeat(v) {
        if(s[it] == 'A') aCount++
        else bCount++
    }

    when {
        aCount > bCount -> {
            print("A")
        }
        aCount < bCount -> {
            print("B")
        }
        aCount == bCount -> {
            print("Tie")
        }
    }
}