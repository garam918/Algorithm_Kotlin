package BOJ.Greedy

fun main() {

    val s = readln()
    var t = readln()

    var answer = 1

    while(s != t) {

        if(s.length >= t.length) {
            answer = 0
            break
        }

        t = if(t.last() == 'A') t.dropLast(1)
        else t.dropLast(1).reversed()
    }

    println(answer)
}