abstract class Shape3D(override val height: Double, override val width: Double) : IFigure {
    abstract val views: Pair<Shape2D, Shape2D>
    abstract fun GetVolume(): Double

}