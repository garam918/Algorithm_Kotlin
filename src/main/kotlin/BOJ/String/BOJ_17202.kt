package BOJ.String

fun main() {

    val a = readLine()!!.toString()
    val b = readLine()!!.toString()

    var temp = ""

    a.forEachIndexed { index, c ->
        temp += c
        temp += b[index]
    }

    var test = ""

    while (true) {
        test = ""
        if (temp.length <= 2) break
        else {
            temp.forEachIndexed { index, c ->
                var count = 0
                if(index != temp.length-1) {
                    count += c.toString().toInt() + temp[index + 1].toString().toInt()

                    if (count.toString().length == 2) test += count.toString().last()
                    else test += count.toString()
                }
            }
        }
        temp = test
    }

    if(temp.length == 2) println(temp)
    else println("0$temp")

}