package refactoring_guru.composite.example.shapes

import java.awt.*

abstract class BaseShape(x: Int, y: Int, private val color: Color) : Shape {
    private var _x: Int = x
    override val x: Int
        get() = _x

    private var _y: Int = y
    override val y: Int
        get() = _y

    override val width: Int = 0
    override val height: Int = 0

    override var selected: Boolean = false

    override fun move(x: Int, y: Int) {
        _x += x
        _y += y
    }

    override fun isInsideBounds(x: Int, y: Int): Boolean =
        x > this.x && x < (this.x + width) && y > this.y && y < (this.y + height)

    override fun paint(graphics: Graphics) {
        if (selected) {
            enableSelectionStyle(graphics)
        } else {
            disableSelectionStyle(graphics)
        }
    }

    protected fun enableSelectionStyle(graphics: Graphics) {
        graphics.color = Color.LIGHT_GRAY
        val g2 = graphics as Graphics2D
        val dash1 = floatArrayOf(2.0f)
        g2.stroke = BasicStroke(
            1.0f,
            BasicStroke.CAP_BUTT,
            BasicStroke.JOIN_MITER,
            2.0f,
            dash1,
            0.0f
        )
    }

    protected fun disableSelectionStyle(graphics: Graphics) {
        graphics.color = color
        val g2 = graphics as Graphics2D
        g2.stroke = BasicStroke()
    }
}
