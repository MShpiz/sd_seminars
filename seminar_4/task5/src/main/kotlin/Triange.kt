class Triange(height: Double, width: Double) : Shape2D(height, width) {
    override fun GetSquare(): Double {
        return (height*width)/2;
    }
}