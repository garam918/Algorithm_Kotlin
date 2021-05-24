package BOJ.String

fun main() {
    val word = readLine()!!.toString()
    val array = arrayOf('a','e','i','o','u')
    var count = 0
    repeat(word.length) {
        if(array.contains(word[it])) count++
    }
    println(count)
}