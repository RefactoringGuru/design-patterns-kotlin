package refactoring_guru.composite.example.shapes

import java.awt.*

class Circle(x: Int, y: Int, radius: Int, color: Color) : BaseShape(x, y, color) {
    override val width: Int = radius * 2
    override val height: Int = radius * 2

    override fun paint(graphics: Graphics) {
        super.paint(graphics)
        graphics.drawOval(x, y, width - 1, height - 1)
    }
}
