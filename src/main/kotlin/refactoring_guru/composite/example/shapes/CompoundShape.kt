package refactoring_guru.composite.example.shapes

import java.awt.*

class CompoundShape(private val components: List<Shape> = emptyList()) : BaseShape(0, 0, Color.BLACK) {
    private val children = mutableListOf<Shape>().apply {
        addAll(components)
    }

    override val x: Int
        get() = children.minOfOrNull { child -> child.x } ?: 0

    override val y: Int
        get() = children.minOfOrNull { child -> child.y } ?: 0

    override val width: Int
        get() = children.maxOfOrNull { child ->
            val childRelativeX = child.x - x
            childRelativeX + child.width
        } ?: 0

    override val height: Int
        get() = children.maxOfOrNull { child ->
            val childRelativeY = child.y - y
            childRelativeY + child.height
        } ?: 0

    override var selected: Boolean
        get() = super.selected
        set(value) {
            super.selected = value
            children.forEach { shape -> shape.selected = value }
        }

    fun add(component: Shape) {
        children.add(component)
    }

    fun add(components: List<Shape>) {
        children.addAll(components)
    }

    fun remove(child: Shape) {
        children.remove(child)
    }

    fun remove(components: List<Shape>) {
        children.removeAll(components)
    }

    fun clear() {
        children.clear()
    }

    override fun move(x: Int, y: Int) {
        children.forEach { shape -> shape.move(x, y) }
    }

    override fun isInsideBounds(x: Int, y: Int): Boolean = children.any { shape -> shape.isInsideBounds(x, y) }

    fun selectChildAt(x: Int, y: Int): Boolean {
        children.forEach { shape ->
            if (shape.isInsideBounds(x, y)) {
                shape.selected = true
                return true
            }
        }
        return false
    }

    override fun paint(graphics: Graphics) {
        if (selected) {
            enableSelectionStyle(graphics)
            graphics.drawRect(x - 1, y - 1, width + 1, height + 1);
            disableSelectionStyle(graphics)
        }
        children.forEach { shape -> shape.paint(graphics) }
    }
}
