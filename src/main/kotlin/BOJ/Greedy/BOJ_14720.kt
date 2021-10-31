package BOJ.Greedy

fun main() {
    val n = readLine()!!.toInt()

    val s = readLine()!!.toString().split(" ")
    val list = ArrayList<String> ()

    s.forEach {
        when{
            it == "0" && list.isEmpty() -> list.add(it)
            list.lastOrNull() == "0" && it == "1" -> list.add(it)
            list.lastOrNull() == "1" && it == "2" -> list.add(it)
            list.lastOrNull() == "2" && it == "0" -> list.add(it)
        }
    }

    println(list.count())
}