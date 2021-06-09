package BOJ.String

fun main() {

    val al = "abcdefghijklmnopqrstuvwxyz"
    val array = IntArray(26) { 0 }
    var answer = ""

    repeat(readLine()!!.toInt()) {
        val name = readLine()!!.toString()
        when(name.first()) {
            'a' -> {
                array[0]++
            }
            'b' -> {
                array[1]++
            }
            'c' -> {
                array[2]++
            }
            'd' -> {
                array[3]++
            }
            'e' -> {
                array[4]++
            }
            'f' -> {
                array[5]++
            }
            'g' -> {
                array[6]++
            }
            'h' -> {
                array[7]++
            }
            'i' -> {
                array[8]++
            }
            'j' -> {
                array[9]++
            }
            'k' -> {
                array[10]++
            }
            'l' -> {
                array[11]++
            }
            'm' -> {
                array[12]++
            }
            'n' -> {
                array[13]++
            }
            'o' -> {
                array[14]++
            }
            'p' -> {
                array[15]++
            }
            'q' -> {
                array[16]++
            }
            'r' -> {
                array[17]++
            }
            's' -> {
                array[18]++
            }
            't' -> {
                array[19]++
            }
            'u' -> {
                array[20]++
            }
            'v' -> {
                array[21]++
            }
            'w' -> {
                array[22]++
            }
            'x' -> {
                array[23]++
            }
            'y' -> {
                array[24]++
            }
            'z' -> {
                array[25]++
            }

        }
    }
    array.forEachIndexed { index, i ->
        if(i >= 5) answer += al[index].toString()
    }
    if(array.maxOrNull()!! < 5) println("PREDAJA")
    else println(answer)
}