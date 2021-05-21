package Programmers.Level1

fun main() {
    println(solution(intArrayOf(1,2,7,6,4)))
}

private fun solution(nums: IntArray): Int {
    var answer = 0

    var test = intArrayOf()

    for(i in nums.indices) {
        for(j in i+1 until nums.size) {
            for(k in j+1 until nums.size) {
                val temp = nums[i] + nums[j] + nums[k]
                test += intArrayOf(temp)
            }
        }
    }

    repeat(test.size) {
        var isPrime = true
        for(i in 2 until test[it]) {
            if(test[it] % i == 0) {
                isPrime = false
            }
        }
        if(isPrime) answer++

    }

    return answer
}