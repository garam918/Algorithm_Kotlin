package Programmers.Level2

fun main() {

    println(solution(arrayOf("Enter uid1234 Muzi", "Enter uid4567 Prodo"
            ,"Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan")).toList())

}

private fun solution(record: Array<String>): Array<String> {
    var answer = arrayOf<String>()

    val map = mutableMapOf<String,String>()
    val list = mutableListOf<String>()

    record.forEach {
        val query = it.split(" ")
        val io = query[0]
        val id = query[1]
        var name = ""

        if(query.size == 3) name = query[2]

        when(io) {
            "Enter" -> {
                list.add("$io $id")
                map[id] = name
            }

            "Leave" -> list.add("$io $id")
            else -> map[id] = name
        }
    }

    list.forEach {
        val s = it.split(" ")
        answer += if(s[0] == "Enter") "${map[s[1]]}님이 들어왔습니다."
        else "${map[s[1]]}님이 나갔습니다."
    }

    return answer
}