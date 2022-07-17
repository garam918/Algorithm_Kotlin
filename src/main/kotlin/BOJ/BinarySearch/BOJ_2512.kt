package BOJ.BinarySearch

private lateinit var list : List<String>
private lateinit var m : String

fun main() {
    val n = readLine()!!.toInt()

    list = readLine()!!.split(" ")

    m = readLine()!!
    var max = list.maxByOrNull { it.toInt() }!!.toInt()

    var min = 0

    if(list.sumBy { it.toInt() } <= m.toInt()) println(max)
    else {

        while (min + 1 < max) {
            val mid = (max + min) /2

            if(check(mid)) min = mid
            else max = mid
        }
        println(min)
    }
}

private fun check(money : Int) : Boolean {

    var sum = 0L
    var budget : Long

    for(i in list.indices) {
        budget = list[i].toLong()
        if(budget >= money) sum += money
        else sum += budget
    }

    return sum <= m.toInt()
}