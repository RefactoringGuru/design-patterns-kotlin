package refactoring_guru.composite.example

import refactoring_guru.composite.example.editor.ImageEditor
import refactoring_guru.composite.example.shapes.Circle
import refactoring_guru.composite.example.shapes.CompoundShape
import refactoring_guru.composite.example.shapes.Dot
import refactoring_guru.composite.example.shapes.Rectangle
import java.awt.Color

/**
 * EN: Demo class. Everything comes together here.
 *
 * RU: Демо-класс. Здесь всё сводится воедино.
 */
fun main() {
    ImageEditor().run {
        loadShapes(
            listOf(
                Circle(10, 10, 10, Color.BLUE),
                CompoundShape(
                    listOf(
                        Circle(110, 110, 50, Color.RED),
                        Dot(160, 160, Color.RED)
                    )
                ),
                CompoundShape(
                    listOf(
                        Rectangle(250, 250, 100, 100, Color.GREEN),
                        Dot(240, 240, Color.GREEN),
                        Dot(240, 360, Color.GREEN),
                        Dot(360, 360, Color.GREEN),
                        Dot(360, 240, Color.GREEN)
                    )
                )
            )
        )
    }
}
