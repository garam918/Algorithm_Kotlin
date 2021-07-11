package BOJ.String

fun main() {

    val agent = ArrayList<String> ()

    repeat(5) {
        agent.add(readLine()!!.toString())
    }

    var loc = intArrayOf()

    repeat(agent.size){
        if(agent[it].contains("FBI")) loc += intArrayOf((it+1))
    }

    if(loc.isEmpty()) println("HE GOT AWAY!")
    else {
        loc.forEachIndexed { index, i ->
            if(index != loc.size-1) {
                print("$i ")
            }
            else print("$i")
        }
    }
}