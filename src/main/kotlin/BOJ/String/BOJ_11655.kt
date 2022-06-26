package BOJ.String

fun main() {

    val upper = listOf('A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T',
            'U','V','W','X','Y','Z')

    val lower = mutableListOf<Char>()
    upper.forEach {
        lower.add(it.toLowerCase())
    }

    readLine()!!.toString().forEach {
        val currentChar : Char

        if(it.isLetter()) {
            currentChar = if(it.isUpperCase()) {
                if(upper.indexOf(it) >= 13) upper[upper.indexOf(it) + 13 - upper.size]
                else upper[upper.indexOf(it) + 13]
            } else {
                if(lower.indexOf(it) >= 13) lower[lower.indexOf(it) + 13 - lower.size]
                else lower[lower.indexOf(it) + 13]
            }

            print(currentChar)
        }
        else print(it)
    }
}