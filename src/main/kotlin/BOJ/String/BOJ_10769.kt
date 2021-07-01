package BOJ.String

fun main() {
    val s = readLine()!!.toString()

    if(!s.contains(":-(") && !s.contains(":-)")) println("none")
    else {

        val sad = s.split(":-(").size
        val happy = s.split(":-)").size

        when {
            sad > happy -> {
                println("sad")
            }
            sad < happy -> {
                println("happy")
            }
            sad == happy -> {
                println("unsure")
            }
        }
    }
}