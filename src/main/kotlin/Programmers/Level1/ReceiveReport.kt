package Programmers.Level1

fun main() {

    val idList = arrayOf("muzi", "frodo", "apeach", "neo")
    val report = arrayOf("muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi")
    val k = 2

    println(solution(idList,report,k).toList())

}

private fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
    var answer = intArrayOf()

    val map = mutableMapOf<String,ArrayList<String>>()
    val list = mutableMapOf<String,Int>()

    id_list.forEach {
        map[it] = arrayListOf()
        list[it] = 0
    }

    report.forEach {
        val name = it.split(" ")[0]
        val user = it.split(" ")[1]

        if(!map[name]!!.contains(user)) {
            map[name]?.add(user)
            list[user] = list[user]!! + 1
        }
    }

    map.forEach {
        var count = 0
        it.value.forEach {
            if(list.filter { it.value >= k }.containsKey(it)) count++
        }
        answer += count
    }

    return answer
}