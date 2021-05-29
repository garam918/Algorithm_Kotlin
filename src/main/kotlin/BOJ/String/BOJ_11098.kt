package BOJ.String

fun main() = repeat(readLine()!!.toInt()) {
        val p = readLine()!!.toInt()
        val hash = HashMap<Int,String>()
        repeat(p) {
            val s = readLine()!!.toString().split(" ")
            val c = s[0].toInt()
            val name = s[1]

            hash[c] = name
        }
        println(hash[hash.keys.maxOrNull()])
}