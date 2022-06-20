package BOJ.DataStructure

fun main() {

    val n = readLine()!!.toInt()
    val list = mutableSetOf<Int>()
    readLine()!!.split(" ").forEach {
        list.add(it.toInt())
    }
    val m = readLine()!!.toInt()

    readLine()!!.split(" ").forEach {
        if(list.contains(it.toInt())) print("1 ")
        else print("0 ")
    }
}