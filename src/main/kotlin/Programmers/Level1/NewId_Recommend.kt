package Programmers.Level1

fun main() {
    println(solution("...!@BaT#*..y.abcdefghijklm"))
}


private fun solution(new_id: String): String {
    var answer = ""

    answer = oneStep(new_id)
    answer = twoStep(answer)
    answer = threeStep(answer)
    answer = fourStep(answer)
    answer = fiveStep(answer)
    answer = sixStep(answer)
    answer = sevenStep(answer)

    return answer
}

private fun oneStep(id: String) = id.toLowerCase()

private fun twoStep(id: String) = id.filterIndexed { index, c ->
    c.isLowerCase() || c.isDigit() || c == '-' || c == '_' || c == '.'
}
private fun threeStep(id: String) : String {
    var i = id
    while (i.contains("..")) {
        if(!i.contains("..")) break
        else i = i.replace("..", ".")
    }
    return i
}

private fun fourStep(id: String) : String {
    var i = id
    if (i.first() == '.') {
        i = i.substring(1, i.length)
    } else if (i.last() == '.') {
        i = i.substring(0, i.length - 1)
    }
    return i
}
private fun fiveStep(id: String) : String {
    var i = id
    if (i.isEmpty()) i = "a"
    return i
}
private fun sixStep(id: String) : String{
    var i = id
    if(i.length >= 16) i = i.substring(0, 15)
    if(i.last() == '.') i = i.substring(0,i.length - 1)
    return i
}
private fun sevenStep(id: String) : String {
    var i = id
    while (i.length < 3) {
        i += i.last()
    }
    return i
}