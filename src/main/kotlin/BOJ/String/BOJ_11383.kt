package BOJ.String

fun main() {
    val s = readLine()!!.toString().split(" ")
    val n = s[0].toInt()

    val strArray = ArrayList<String>()
    val str2Array = ArrayList<String>()
    val bool = ArrayList<Boolean> ()
    repeat(n) {
        val str = readLine()!!.toString()
        strArray.add(str)
    }

    repeat(n) {
        val str2 = readLine()!!.toString()
        str2Array.add(str2)
    }

    repeat(n) {
        var temp = ""
        strArray[it].forEachIndexed { index, c ->
            temp += "$c$c"
        }
        if(temp == str2Array[it]) bool.add(true)
        else bool.add(false)
    }

    if(bool.contains(false)) println("Not Eyfa")
    else println("Eyfa")

}