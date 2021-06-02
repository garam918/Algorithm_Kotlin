package BOJ.String

fun main() {
    var s : String
    val array = arrayOf('a','e','i','o','u')
    while(true) {
        s = readLine()!!.toString()
        var count = 0
        if(s == "#") break
        else {
            s.forEachIndexed { index, c ->
                if(array.contains(c) || array.contains(c.toLowerCase())) count++
            }
            println(count)
        }
    }
}