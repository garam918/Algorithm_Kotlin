package BOJ.Implementation

fun main() = repeat(readLine()!!.toInt()) {

    Integer.parseInt(readLine()!!.toString(),10).toString(2).reversed().forEachIndexed { index, c ->
        if(c == '1') print("$index ")
    }
}