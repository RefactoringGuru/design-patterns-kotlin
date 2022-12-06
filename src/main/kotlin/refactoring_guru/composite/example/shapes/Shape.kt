package refactoring_guru.composite.example.shapes

import java.awt.*

interface Shape {
    val x: Int
    val y: Int
    val width: Int
    val height: Int
    var selected: Boolean

    fun move(x: Int, y: Int)
    fun isInsideBounds(x: Int, y: Int): Boolean
    fun paint(graphics: Graphics)
}
