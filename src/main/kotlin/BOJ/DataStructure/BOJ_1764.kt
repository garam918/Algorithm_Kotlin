package BOJ.DataStructure

fun main() {
    val nm = readLine()!!.toString().split(" ")
    val n = nm[0].toInt()
    val m = nm[1].toInt()

    val noHear = mutableSetOf<String>()
    val offBrand = mutableSetOf<String>()

    repeat(n) {
        noHear.add(readLine()!!.toString())
    }

    repeat(m) {
        val name = readLine()!!.toString()
        if(noHear.contains(name)) offBrand.add(name)
    }

    println(offBrand.size)
    offBrand.sortedBy { it }.forEach { s ->
        println(s)
    }
}