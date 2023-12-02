import java.lang.Integer.min

fun main(args: Array<String>) {
    val str = readLine()
    if (str?.isEmpty() == true) {
        println(0)
        return
    }
    val num_lis: List<String> = str?.split(" ") ?: listOf()
    println("${num_lis.distinct().count()} ${num_lis.distinct()} ${num_lis.size}")
}