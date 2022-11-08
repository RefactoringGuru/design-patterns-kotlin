package refactoring_guru.prototype.example.shapes

data class Circle(
    val radius: Int,
    override val x: Int,
    override val y: Int,
    override val color: String
) : Shape(x, y, color) {

    constructor(target: Circle) : this(target.radius, target.x, target.y, target.color)

    override fun clone(): Shape = Circle(this)
}
