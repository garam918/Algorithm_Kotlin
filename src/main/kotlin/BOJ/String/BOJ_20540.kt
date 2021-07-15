package BOJ.String

fun main() {
    readLine()!!.toString().forEachIndexed { index, c ->
        when(c) {
            'I' -> {
                print('E')
            }
            'E' -> {
                print('I')
            }
            'S' -> {
                print('N')
            }
            'N' -> {
                print('S')
            }
            'T' -> {
                print('F')
            }
            'F' -> {
                print('T')
            }
            'J' -> {
                print('P')
            }
            'P' -> {
                print('J')
            }
        }
    }
}