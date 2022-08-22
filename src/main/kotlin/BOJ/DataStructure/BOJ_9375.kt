package BOJ.DataStructure

fun main() = repeat(readln().toInt()) {
    var answer = 1
    val hash = hashMapOf<String,MutableList<String>>()

    repeat(readln().toInt()) {
        val (name, type) = readln().split(" ")
        if(hash[type].isNullOrEmpty()) hash[type] = mutableListOf(name)
        else hash[type]?.add(name)
    }

    if(hash.size >= 2) hash.forEach { (t, u) -> answer *= u.size + 1 }
    else hash.forEach { (t, u) -> answer += u.size }

    println(--answer)
}