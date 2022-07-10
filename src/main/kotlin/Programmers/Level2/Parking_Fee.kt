package Programmers.Level2

fun main() {

    println(solution(intArrayOf(180, 5000, 10, 600),
            arrayOf("00:23 5961 IN", "01:12 5961 OUT")).toList())

}

private fun solution(fees: IntArray, records: Array<String>): IntArray {
    var answer: IntArray = intArrayOf()

    val basicTime = fees[0]
    val basicFee = fees[1]
    val unitTime = fees[2]
    val unitFee = fees[3]

    val feeInfo = mutableMapOf<String,Int>()
    val inMap = mutableMapOf<String,String>()

    records.forEach {
        val (time, number, io) = it.split(" ")

        if(io == "IN") inMap[number] = time
        else {
            val t = timeToMin(inMap[number].toString(),time)

            if(!feeInfo.containsKey(number)) feeInfo[number] = t
            else feeInfo[number] = feeInfo[number]!! + t

            inMap.remove(number)
        }
    }

    if(inMap.isNotEmpty()) {
        inMap.forEach {
            val t = timeToMin(it.value,"23:59")

            if(feeInfo.containsKey(it.key)) feeInfo[it.key] = feeInfo[it.key]!! + t
            else feeInfo[it.key] = t
        }
    }
    println(feeInfo)

    feeInfo.toList().sortedBy { it.first.toInt() }.forEach {
        answer += when {
            it.second <= basicTime -> basicFee
            else -> {
                when {
                    (it.second - basicTime) / unitTime == 0 -> basicFee + unitFee
                    (it.second - basicTime) % unitTime == 0 -> basicFee + (((it.second - basicTime) / unitTime) * unitFee)
                    else -> basicFee + ((((it.second - basicTime) / unitTime) + 1) * unitFee)
                }
            }
        }
    }

    return answer
}

private fun timeToMin(inTime : String, outTime : String) : Int{
    var h = (outTime.substring(IntRange(0,1)).toInt() - inTime.substring(IntRange(0,1)).toInt())
    var m = (outTime.substring(IntRange(3,4)).toInt() - inTime.substring(IntRange(3,4)).toInt())

    if(m < 0) {
        h -= 1
        m = (60 - inTime.substring(IntRange(3,4)).toInt() + outTime.substring(IntRange(3,4)).toInt())
    }

    return (h * 60) + m
}