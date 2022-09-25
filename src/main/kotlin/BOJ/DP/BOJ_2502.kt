package BOJ.DP

fun main() {
    val (d,k) = readln().split(" ").map { it.toInt() }
    val x = dp(d-2)
    val y = dp(d-1)

    loop@
    for(i in 1 .. 100000) {
        for(j in i .. 100000) {
            if(((x * i) + (y * j)) == k) {
                println(i)
                println(j)
                break@loop
            }
        }
    }
}

private fun dp(x: Int) : Int = if(x <= 2) 1
else dp(x-1) + dp(x-2)