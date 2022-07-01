package BOJ.Implementation

fun main() {

    val nk = readLine()!!.split(" ")
    val n = nk[0].toInt()
    val k = nk[1].toInt()

    val list = mutableListOf<Int>()
    val answerList = mutableListOf<Int>()

    val check = BooleanArray(n+2)

    for(i in 2 .. n) {
        list.add(i)
    }
    var min = 0

    while(true) {
        if(list.isEmpty()) break

        list.minOrNull()?.let {
             min = it
        }

        if(isPrime(min)) {

            for(i in min .. n step min) {
                if(!check[i]) {
                    check[i] = true
                    list.remove(i)
                    answerList.add(i)
                }
            }
        }
    }
    println(answerList[k-1])

}

private fun isPrime(x :Int) : Boolean {
    var check = true

    for(i in 2 until x) {
        if(x % i == 0) {
            check = false
            break
        }
    }

    return check
}