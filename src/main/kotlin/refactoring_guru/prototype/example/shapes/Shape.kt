package refactoring_guru.prototype.example.shapes

abstract class Shape(open val x: Int, open val y: Int, open val color: String) : Cloneable {

    constructor(target: Shape) : this(target.x, target.y, target.color)

    public abstract override fun clone(): Shape

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Shape) return false

        if (x != other.x) return false
        if (y != other.y) return false
        if (color != other.color) return false

        return true
    }

    override fun hashCode(): Int {
        var result = x
        result = 31 * result + y
        result = 31 * result + color.hashCode()
        return result
    }
}
