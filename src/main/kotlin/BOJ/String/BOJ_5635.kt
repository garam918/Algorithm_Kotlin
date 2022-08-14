package BOJ.String

fun main() {

    val list = mutableListOf<String>()

    repeat(readln().toInt()) { list.add(readln()) }

    list.sortWith(compareBy ({ it.split(" ")[3].toInt() }, {it.split(" ")[2].toInt()} , {it.split(" ")[1].toInt()}) )

    println(list)
    println(list.lastOrNull()!!.split(" ")[0])
    println(list.first().split(" ")[0])
}