package BOJ.String

fun main() {
    var s = ""
    while(s != "#") {
        s = readLine()!!.toString()

        if(s == "#") break
        else {
            var count = 0
            var answer = ""

            s.forEachIndexed { index, c ->
                if (c == '1') count++
            }

            if (count % 2 == 0) {
                answer = if (s.last() == 'e') {
                    s.replace('e', '0')
                } else s.replace('o', '1')

                println(answer)
            }
            else {
                answer = if(s.last() == 'e') {
                    s.replace('e','1')
                } else s.replace('o','0')

                println(answer)
            }
        }
    }
}