package BOJ.Implementation

fun main() {
    val s = readLine()!!.toString().split(" ")
    val m = s[0].toInt()
    val n = s[1].toInt()

    var currentX = 0
    var currentY = 0
    var currentDirection = "E"

    for(i in 0 until n) {
        val t = readLine()!!.toString().split(" ")

        when(t[0]) {
            "MOVE" -> {
                when(currentDirection) {

                    "E" -> {
                        if(currentX + t[1].toInt() > m) {
                            currentX += t[1].toInt()
                            break
                        }
                        else currentX += t[1].toInt()
                    }

                    "W" -> {
                        if(currentX - t[1].toInt() < 0) {
                            currentX -= t[1].toInt()
                            break
                        }
                        else currentX -= t[1].toInt()
                    }

                    "S" -> {
                        if(currentY - t[1].toInt() < 0) {
                            currentY -= t[1].toInt()
                            break
                        }
                        else currentY -= t[1].toInt()
                    }

                    "N" -> {
                        if(currentY + t[1].toInt() > m) {
                            currentY += t[1].toInt()
                            break
                        }
                        else currentY += t[1].toInt()
                    }
                }
            }

            "TURN" -> {

                when(t[1]) {

                    "0" -> {
                        when(currentDirection) {
                            "E" -> currentDirection = "N"

                            "W" -> currentDirection = "S"

                            "S" -> currentDirection = "E"

                            "N" -> currentDirection = "W"
                        }
                    }

                    "1" -> {
                        when(currentDirection) {
                            "E" -> currentDirection = "S"

                            "W" -> currentDirection = "N"

                            "S" -> currentDirection = "W"

                            "N" -> currentDirection = "E"
                        }
                    }

                }

            }

        }
    }

    if(currentX > m || currentY > m || currentX < 0 || currentY < 0) println(-1)
    else println("$currentX $currentY")
}