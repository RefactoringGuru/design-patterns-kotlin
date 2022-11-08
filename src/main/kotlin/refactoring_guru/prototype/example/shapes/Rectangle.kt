package refactoring_guru.prototype.example.shapes

data class Rectangle(
    val width: Int,
    val height: Int,
    override val x: Int,
    override val y: Int,
    override val color: String
) : Shape(x, y, color) {

    constructor(target: Rectangle) : this(target.width, target.height, target.x, target.y, target.color)

    override fun clone(): Shape = Rectangle(this)
}
