fun main(args: Array<String>) {
    var num = readLine()?.toInt() ?: 0
    if (num < 0) {num = 0}
    val arr: Array<Array<Int>> = Array(num) { Array(num) {(-100..100).random()} }
    for (i in 0 until num) {
        for (j in 0 until num) {
            print("${arr[i][j]} ")
        }
        println()
    }

    var sum = 0
    for (i in 0 until num) {
        for (j in 0 until num) {
            if (i + j >= num) {
                sum += arr[i][j]
            }
        }
    }
    println(sum)
}