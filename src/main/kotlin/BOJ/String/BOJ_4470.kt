package BOJ.String

fun main() {
    val array = ArrayList<String> ()

    repeat(readLine()!!.toInt()) {
        array.add(readLine()!!.toString())
    }

    repeat(array.size) {
        println("${it+1}. ${array[it]}")
    }
}