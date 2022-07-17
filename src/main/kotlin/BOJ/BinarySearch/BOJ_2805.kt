package BOJ.BinarySearch

private lateinit var list : List<String>
private lateinit var m : String

fun main() {

    val nm = readLine()!!.split(" ")
    val n = nm[0]
    m = nm[1]

    list = readLine()!!.split(" ")

    var low = 0
    var high = list.maxOfOrNull { it.toInt() }!!.toInt()

    while(low + 1 < high) {
        val mid = (high + low)/2

        if (check(mid)) low = mid
        else high = mid

    }
    println(low)
}

private fun check(height : Int) : Boolean {

    var sum = 0L
    var tree : Long


    for(i in list.indices) {
        tree = list[i].toLong()
        if(tree >= height) sum += tree - height
    }

    return sum >= m.toInt()
}