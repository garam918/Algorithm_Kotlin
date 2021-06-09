package BOJ.Greedy

fun main () {
    var t = readLine()!!.toInt()

    val a = 300
    val b = 60
    val c = 10

    var aCount = 0
    var bCount = 0
    var cCount = 0
    var answer = 0
    while(t != 0) {
        when {
            t >= a -> {
                t -= a
                aCount++
            }
            t >= b -> {
                t -= b
                bCount++
            }
            t >= c -> {
                t -= c
                cCount++
            }
            t < c -> {
                answer = -1
                break
            }
        }
    }
    if(answer != 0) println(answer)
    else println("$aCount $bCount $cCount")
}