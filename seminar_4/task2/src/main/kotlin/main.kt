fun main(args: Array<String>) {
    val str: String? = readLine()
    val last: String = str?.split(" ")?.last() ?: ""
    println(str)
    repeat(3) {
        println(last)
    }
}