package BOJ.String

fun main() {

    val colorHash = HashMap<String,IntArray>()

    colorHash["black"] = intArrayOf(0,1)
    colorHash["brown"] = intArrayOf(1,10)
    colorHash["red"] = intArrayOf(2,100)
    colorHash["orange"] = intArrayOf(3,1000)
    colorHash["yellow"] = intArrayOf(4,10000)
    colorHash["green"] = intArrayOf(5,100000)
    colorHash["blue"] = intArrayOf(6,1000000)
    colorHash["violet"] = intArrayOf(7,10000000)
    colorHash["grey"] = intArrayOf(8,100000000)
    colorHash["white"] = intArrayOf(9,1000000000)

    var answer : Long = 0
    var temp = ""
    repeat(3) {
        val color = readLine()!!.toString()
        if(it != 2) {
            if(colorHash.containsKey(color)) temp += colorHash[color]!![0]
        }
        else answer = (temp.toLong() * colorHash[color]!![1].toLong())
    }
    println(answer)
}