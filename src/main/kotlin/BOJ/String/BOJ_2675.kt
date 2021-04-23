package BOJ.String

fun main() {

    val t = readLine()!!.toInt()
    val array = arrayListOf<String>()

    repeat(t) {
        var temp = ""
        val line = readLine()!!.split(" ")
        val r = line[0].toInt()
        val s = line[1]

        s.mapIndexed { index, c ->
            repeat(r) {
                temp += c
            }
        }
        array.add(temp)
    }
    repeat(array.size) {
        println(array[it])
    }

}