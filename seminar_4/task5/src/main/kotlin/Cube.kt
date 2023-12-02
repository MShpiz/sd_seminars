class Cube(height: Double, width: Double) : Shape3D(height, width) {
    override val views: Pair<Shape2D, Shape2D>
        get() = Pair(Square(width, width), Square(width, height));

    override fun GetVolume(): Double {
        return width*width*height;
    }
}