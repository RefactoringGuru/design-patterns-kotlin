package refactoring_guru.composite.example.shapes

import java.awt.*

class Dot(x: Int, y: Int, color: Color) : BaseShape(x, y, color) {
    override val width: Int = DOT_SIZE
    override val height: Int = DOT_SIZE

    override fun paint(graphics: Graphics) {
        super.paint(graphics);
        graphics.fillRect(x - 1, y - 1, width, height)
    }

    companion object {
        private const val DOT_SIZE = 3
    }
}
