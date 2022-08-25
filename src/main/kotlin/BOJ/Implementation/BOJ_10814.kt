package BOJ.Implementation

fun main () {

    val map = mutableMapOf<Int,MemberInfo>()

    repeat(readln().toInt()) {
        val info = readln().split(" ")
        map[it+1] = MemberInfo(info[0].toInt(), info[1])
    }

    map.toList().sortedWith(compareBy( { it.second.age } , { it.first } )).forEach {
        println("${it.second.age} ${it.second.name}")
    }

}

private data class MemberInfo(
    val age: Int,
    val name : String
)