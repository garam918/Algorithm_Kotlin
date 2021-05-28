package BOJ.String

fun main() {
    val n = readLine()!!.toInt()
    val s = readLine()!!.toString()
    lateinit var temp : String
    var test = s
    repeat(n) {
        temp = ""
        test.forEachIndexed { index, c ->
            temp += if(c == '1') '0'
            else '1'
        }
        test = temp
    }
    val k = readLine()!!.toString()
    if(temp == k) println("Deletion succeeded")
    else println("Deletion failed")
}