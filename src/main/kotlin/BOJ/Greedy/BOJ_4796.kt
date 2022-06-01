package BOJ.Greedy

fun main() {

    var currentCase = 0

    while (true) {
        val lpv = readLine()!!
        var count = 0

        val l = lpv.split(" ")[0].toInt()
        val p = lpv.split(" ")[1].toInt()
        var v = lpv.split(" ")[2].toInt()
        if(lpv == "0 0 0") break
        else {
            currentCase++
            while(true) {
                if(v < p) {
                    count += if(v <= l) v
                    else l
                    break
                }
                else {
                    v -= p
                    count += l
                }
            }

            println("Case $currentCase: $count")

        }
    }
}