package BOJ.String

fun main() {
    val hash = HashMap<String,String>()

    repeat(readLine()!!.toInt()) {
        val s = readLine()!!.toString().split(" ")

        if(s[1] == "enter") hash[s[0]] = s[1]
        else hash.remove(s[0])
    }
    hash.keys.sortedDescending().onEachIndexed { index, s ->
        println(s)
    }
}