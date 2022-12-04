package refactoring_guru.composite.example.editor

import refactoring_guru.composite.example.shapes.CompoundShape
import refactoring_guru.composite.example.shapes.Shape
import java.awt.Canvas
import java.awt.Color
import java.awt.Graphics
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import javax.swing.BorderFactory
import javax.swing.JFrame
import javax.swing.JPanel
import javax.swing.WindowConstants

class ImageEditor {
    private val allShapes = CompoundShape()
    private val canvas = EditorCanvas()

    fun loadShapes(shapes: List<Shape>) {
        allShapes.clear()
        allShapes.add(shapes)
        canvas.refresh()
    }

    private inner class EditorCanvas : Canvas() {
        private val padding = 10

        val frame = JFrame().apply {
            defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE
            setLocationRelativeTo(null)

            val contentPanel = JPanel()
            val padding = BorderFactory.createEmptyBorder(padding, padding, padding, padding)
            contentPanel.border = padding
            contentPane = contentPanel

            add(this@EditorCanvas)
            isVisible = true
            contentPane.background = Color.LIGHT_GRAY
        }

        init {
            refresh()
            addMouseListener(object : MouseAdapter() {
                override fun mousePressed(e: MouseEvent) {
                    allShapes.selected = false
                    allShapes.selectChildAt(e.x, e.y)
                    e.component.repaint()
                }
            })
        }

        override fun getWidth(): Int = allShapes.x + allShapes.width + padding

        override fun getHeight(): Int = allShapes.y + allShapes.height + padding

        fun refresh() {
            setSize(width, height)
            frame.pack()
        }

        override fun paint(graphics: Graphics) {
            allShapes.paint(graphics)
        }
    }
}
