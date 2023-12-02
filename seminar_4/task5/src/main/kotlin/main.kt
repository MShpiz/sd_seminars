import com.sun.jdi.InvalidTypeException

fun main(args: Array<String>) {
    print("Введите тип фигуры: ")
    val type = readLine()
    print("Введите высоту  фигуры: ")
    val height = readLine()?.toDouble() ?: 0.0
    print("Введите основание/диаметр  фигуры: ")
    val width = readLine()?.toDouble() ?: 0.0

    val fig = when(type) {
        "конус" -> Cone(height, width)
        "куб" -> Cube(height, width)
        "пирамида" -> Pyramid(height, width)
        else -> throw InvalidTypeException()
    }
    println("""Объем ${type}: ${fig.GetVolume()}
Площадь боковой проекции: ${fig.views.first.GetSquare()}
Площадь проекции сверху: ${fig.views.second.GetSquare()}""")
}