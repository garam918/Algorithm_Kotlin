package BOJ.String

private val hash = HashMap<Int,String>().apply {
    this[0] = "zero"
    this[1] = "one"
    this[2] = "two"
    this[3] = "three"
    this[4] = "four"
    this[5] = "five"
    this[6] = "six"
    this[7] = "seven"
    this[8] = "eight"
    this[9] = "nine"
}

fun main() {

    val s = readLine()!!.toString().split(" ")
    val m = s[0].toInt()
    val n = s[1].toInt()

    val array = ArrayList<String>(n-m+1)

    repeat(n-m+1) {
        if(m+it < 10) {
            array.add(hash[m+it].toString())
        }
        else {
            array.add(hash[(m+it).toString().first().toString().toInt()].toString()
                  + " " + hash[(m+it).toString().last().toString().toInt()].toString())
        }
    }

    array.sortedBy { it }.onEachIndexed { index, s ->
        if(index % 10 != 9) {
            print(strToNum(s) + " ")

        }
        else {
            print(strToNum(s) + " ")
            println()
        }
    }

}

private fun strToNum(str : String) : String {
    var temp = ""

    str.split(" ").forEach { str->
        temp += hash.filter { it.value == str }.keys.toList().last()
    }

    return temp
}