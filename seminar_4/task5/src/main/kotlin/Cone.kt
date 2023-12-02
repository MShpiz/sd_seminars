class Cone(height: Double, width: Double) : Shape3D(height, width) {
    override val views: Pair<Shape2D, Shape2D>
        get() = Pair(Circle(width, width), Triange(width, height))

    override fun GetVolume(): Double {
        return 3.14*width*width*height/12
    }
}