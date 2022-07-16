package BOJ.BruteForce

fun main() {

    val n = readLine()!!
    val f = readLine()!!.toInt()

    var answer = ""
    var v = "${n.substring(IntRange(0, n.length - 3))}00".toInt()

    if(v % f == 0) answer = "00"
    else {
        while (true) {
            v++
            if(v % f == 0) {
                answer = v.toString().substring(IntRange(v.toString().length-2,v.toString().length-1))
                break
            }
        }
    }
    println(answer)
}