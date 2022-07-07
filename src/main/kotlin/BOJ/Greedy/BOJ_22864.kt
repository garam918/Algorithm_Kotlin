package BOJ.Greedy

fun main() {

    val (a , b , c , m) = readLine()!!.split(" ")

    var count = 0
    var answer = 0
    var time = 0

    while (time != 24) {
        if(count > m.toInt()) break
        else {
            when {
                count + a.toInt() > m.toInt() -> {
                    time++
                    count -= c.toInt()
                }
                count + a.toInt() <= m.toInt() -> {
                    time++
                    count += a.toInt()
                    answer += b.toInt()
                }
            }
        }
        if(count < 0) count = 0
    }
    println(answer)
}