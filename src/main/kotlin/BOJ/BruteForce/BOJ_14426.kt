package BOJ.BruteForce

fun main() {

    val nm = readLine()!!.split(" ")
    val n = nm[0]
    val m = nm[1]

    val nList = mutableListOf<String>()
    repeat(n.toInt()) {
        nList.add(readLine()!!.toString())
    }

    val mList= mutableListOf<String>()
    repeat(m.toInt()) {
        mList.add(readLine()!!.toString())
    }

    var count = 0

    repeat(m.toInt()) {
        for(i in nList.indices) {
            if(nList[i].substring(IntRange(0,mList[it].length-1)) == mList[it]) {
                count++
                break
            }
        }
    }

    println(count)
}