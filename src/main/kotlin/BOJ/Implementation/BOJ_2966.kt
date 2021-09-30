package BOJ.Implementation

fun main() {

    var one = "ABC"
    var two = "BABC"
    var three = "CCAABB"

    val list = hashMapOf<String,Int>()

    var oneCount = 0
    var twoCount = 0
    var threeCount = 0

    val n = readLine()!!.toInt()
    val answer = readLine()!!.toString()

    one = setRepeat(one,n)
    two = setRepeat(two,n)
    three = setRepeat(three,n)

    answer.forEachIndexed { index, c ->
        if(c.toString() == one[index].toString()) oneCount++
        if(c.toString() == two[index].toString()) twoCount++
        if(c.toString() == three[index].toString()) threeCount++
    }

    list["Adrian"] = oneCount
    list["Bruno"] = twoCount
    list["Goran"] = threeCount

    val answers = arrayListOf<String>()

    list.forEach { it ->
        if(it.value == list.values.maxOrNull()) answers.add(it.key)
    }

    println(list.values.maxOrNull())
    answers.sorted().forEach {
        println(it)
    }

}

private fun setRepeat(str : String, size : Int) = str.repeat((size/ str.length )+ 1).substring(0,size)