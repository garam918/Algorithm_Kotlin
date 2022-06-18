package Programmers.Level1

import kotlin.math.absoluteValue

fun main() {
    println(solution(intArrayOf(7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2),"left"))
}

private fun solution(numbers: IntArray, hand: String): String {
    var answer = ""

    val leftArray = arrayOf("*","7","4","1")
    val middleArray = arrayOf("0","8","5","2")
    val rightArray = arrayOf("#","9","6","3")

    var currentLeft = "*"
    var currentRight = "#"

    numbers.forEach { i ->
        val it = i.toString()

        when{
            leftArray.contains(it) -> {
                answer += "L"
                currentLeft = it

            }
            rightArray.contains(it) -> {
                answer += "R"
                currentRight = it

            }
            middleArray.contains(it) -> {
                val leftDistance = if(!middleArray.contains(currentLeft)) (middleArray.indexOf(it) - leftArray.indexOf(currentLeft)).absoluteValue + 1
                else (middleArray.indexOf(currentLeft) - middleArray.indexOf(it)).absoluteValue

                val rightDistance = if(!middleArray.contains(currentRight)) (middleArray.indexOf(it) - rightArray.indexOf(currentRight)).absoluteValue + 1
                else (middleArray.indexOf(currentRight) - middleArray.indexOf(it)).absoluteValue


                when {
                    leftDistance > rightDistance -> {
                        answer += "R"
                        currentRight = it
                    }
                    leftDistance < rightDistance -> {
                        answer += "L"
                        currentLeft = it
                    }
                    leftDistance == rightDistance -> {
                        if(hand == "right") {
                            answer += "R"
                            currentRight = it
                        } else {
                            answer += "L"
                            currentLeft = it
                        }
                    }

                }
            }
        }
    }

    return answer
}