package refactoring_guru.composite.example.shapes

import java.awt.*

class Rectangle(
    x: Int,
    y: Int,
    override val width: Int,
    override val height: Int,
    color: Color
) : BaseShape(x, y, color) {

    override fun paint(graphics: Graphics) {
        super.paint(graphics)
        graphics.drawRect(x, y, width - 1, height - 1)
    }
}
