class Circle(height: Double, width: Double) : Shape2D(height, width) {
    override fun GetSquare(): Double {
        return width*width*3.14/4
    }
}