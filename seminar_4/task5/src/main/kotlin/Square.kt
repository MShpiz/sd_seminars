class Square(height: Double, width: Double) : Shape2D(height, width) {
    override fun GetSquare(): Double {
        return height*width;
    }
}