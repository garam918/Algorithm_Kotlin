package BOJ.Implementation

fun main() {
    val nm = readLine()!!.toString().split(" ")

    val list = mutableListOf<PostIt>()

    repeat(nm[0].toInt()) {
        val command = readLine()!!.toString().split(" ")

        when {
            command.contains("sort") -> {
                list.sortBy { it.time }
            }

            command.contains("order") -> {
                list.add(PostIt(command[1].toInt(),command[2].toInt()))
            }

            command.contains("complete") -> {
                list.remove(list.find { it.table == command[1].toInt() })

            }
        }

        if (list.isEmpty()) println("sleep")
        else {
            list.forEach { print("${it.table} ") }
            println()
        }
    }
}

private data class PostIt(
        val table : Int,
        val time : Int
)