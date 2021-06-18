package BOJ.Greedy


fun main() {
    val q = 25
    val d = 10
    val n = 5
    val p = 1

    repeat(readLine()!!.toInt()) {
        var qCount = 0
        var dCount = 0
        var nCount = 0
        var pCount = 0
        val c = readLine()!!.toInt()

        var temp = c

        while(temp != 0) {
            when {
                temp >= q -> {
                    temp -= q
                    qCount++
                }
                temp in d until q -> {
                    temp -= d
                    dCount++
                }
                temp in n until d -> {
                    temp -= n
                    nCount++
                }
                temp in p until n -> {
                    temp -= p
                    pCount++
                }
             }
        }
        println("$qCount $dCount $nCount $pCount")
    }
}