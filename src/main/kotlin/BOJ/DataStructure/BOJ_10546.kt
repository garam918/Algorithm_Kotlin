package BOJ.DataStructure

fun main() {
    val n = readLine()!!.toInt()
    val list = mutableMapOf<String,Int>()

    repeat(n) {
        val name = readLine()!!
        if(list.containsKey(name)) list[name] = list[name]!! + 1
        else list[name] = 1
    }
    repeat(n-1) {
        val name = readLine()!!
        if(list[name] == 1) list[name] = 0
        else list[name] = list[name]!! - 1
    }
    println(list.filter { it.value != 0 }.keys.first())
}