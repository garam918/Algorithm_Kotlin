package BOJ.String

fun main() {
    readLine()!!.toString().onEachIndexed { index, c ->
        if(!"CAMBRIDGE".contains(c)) print(c)
    }
}