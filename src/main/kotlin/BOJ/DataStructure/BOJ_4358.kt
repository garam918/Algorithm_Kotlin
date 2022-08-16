package BOJ.DataStructure

fun main() {

    val map = hashMapOf<String,Int>()
    var count = 0

    while(true) {
        val name = readlnOrNull()

        if(name == null || name == "") break

        else {
            count++

            if (map.containsKey(name)) map[name] = map[name]!!.toInt() + 1
            else map[name] = 1
        }
    }

    map.toList().sortedBy { it.first }.toMap().forEach { (t, u) ->
       println("$t " + String.format("%.4f",(u.toDouble() / count.toDouble()) * 100))
    }
}