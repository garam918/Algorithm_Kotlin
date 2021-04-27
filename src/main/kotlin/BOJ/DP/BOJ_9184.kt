package BOJ.DP

fun main() {

    var a : Int
    var b : Int
    var c : Int

    while(true) {

        val s = readLine()!!
        a = s.split(" ")[0].toInt()
        b = s.split(" ")[1].toInt()
        c = s.split(" ")[2].toInt()

        if(a == -1 && b == -1 && c == -1) break
        else println("w($a, $b, $c) = ${w(a,b,c)}")
    }

}
private var array = HashMap<List<Int>,Int>(100)

private fun w(a: Int, b: Int, c:Int) : Int {
    return when {

        array[listOf(a,b,c)] != null -> {
            array[listOf(a,b,c)]!!.toInt()
        }

        a <= 0 || b <= 0 || c <= 0 -> {
            1
        }

        a > 20 || b > 20 || c > 20 -> {
            w(20,20,20)
//            array[listOf(a,b,c)] = w(20,20,20)
//            array[listOf(a,b,c)]!!.toInt()
        }

        (a < b) && (b < c)  -> {
            array[listOf(a,b,c)] = w(a,b,c-1) + w(a,b-1,c-1) - w(a,b-1,c)
            array[listOf(a,b,c)]!!.toInt()
        }

        else -> {
            array[listOf(a,b,c)] = w(a-1,b,c) + w(a-1,b-1,c) + w(a-1,b,c-1) - w(a-1,b-1,c-1)
            array[listOf(a,b,c)]!!.toInt()
        }

    }

}