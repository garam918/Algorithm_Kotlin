package BOJ.String

fun main() {
    val list = MutableList (26) { 0 }
    val s = readLine()!!.toString()

    repeat(s.length) {
        when(s[it]) {
            'a' -> {
                list[0]++
            }
            'b' -> {
                list[1]++
            }
            'c' -> {
                list[2]++
            }
            'd' -> {
                list[3]++
            }
            'e' -> {
                list[4]++
            }
            'f' -> {
                list[5]++
            }
            'g' -> {
                list[6]++
            }
            'h' -> {
                list[7]++
            }
            'i' -> {
                list[8]++
            }
            'j' -> {
                list[9]++
            }
            'k' -> {
                list[10]++
            }
            'l' -> {
                list[11]++
            }
            'm' -> {
                list[12]++
            }
            'n' -> {
                list[13]++
            }
            'o' -> {
                list[14]++
            }
            'p' -> {
                list[15]++
            }
            'q' -> {
                list[16]++
            }
            'r' -> {
                list[17]++
            }
            's' -> {
                list[18]++
            }
            't' -> {
                list[19]++
            }
            'u' -> {
                list[20]++
            }
            'v' -> {
                list[21]++
            }
            'w' -> {
                list[22]++
            }
            'x' -> {
                list[23]++
            }
            'y' -> {
                list[24]++
            }
            'z' -> {
                list[25]++
            }

        }
    }
    list.onEachIndexed { index, i ->
        if(index != 25) print("$i ")
        else print(i)
    }
}