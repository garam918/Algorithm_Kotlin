package BOJ.Implementation

fun main() {

    val n = readLine()!!.toInt()

    val road = readLine()!!.split(" ")

    val list = mutableSetOf<Int>()
    val uphill = mutableSetOf<Int>()

    road.forEachIndexed { index, s ->
        if(index != 0) {
            if (s.toInt() > road[index - 1].toInt()) {
                list.add(road[index-1].toInt())
                list.add(s.toInt())

                if(index == road.size-1 && list.size != 1) uphill.add(list.last()-list.first())
            }
            else {
                if(list.size != 1 && list.isNotEmpty()) uphill.add(list.last()-list.first())
                list.clear()
            }
        }
    }
    if(uphill.isEmpty()) println(0)
    else println(uphill.maxOrNull())

}