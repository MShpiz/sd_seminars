class Pyramid(height: Double, width: Double) : Shape3D(height, width) {
    override val views: Pair<Shape2D, Shape2D>
        get() = Pair(Square(width, width), Triange(width, height))

    override fun GetVolume(): Double {
        return views.first.GetSquare()*height/3
    }
}