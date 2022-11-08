package refactoring_guru.prototype.example

import refactoring_guru.prototype.example.shapes.Circle
import refactoring_guru.prototype.example.shapes.Rectangle
import refactoring_guru.prototype.example.shapes.Shape

fun main() {
    val shapes = mutableListOf<Shape>()
    val shapesCopy = mutableListOf<Shape>()

    val circle = Circle(
        radius = 15,
        x = 10,
        y = 20,
        color = "red"
    )
    shapes.add(circle)

    val anotherCircle = circle.clone()
    shapes.add(anotherCircle)

    val rectangle = Rectangle(
        width = 10,
        height = 20,
        x = 20,
        y = 30,
        color = "blue"
    )
    shapes.add(rectangle)

    cloneAndCompare(shapes, shapesCopy)
}

fun cloneAndCompare(shapes: List<Shape>, shapesCopy: MutableList<Shape>) {
    shapes.forEach { shape ->
        shapesCopy.add(shape.clone())
    }

    for(i in shapes.indices) {
        if (shapes[i] !== shapesCopy[i]) {
            println("$i: Shapes are different objects (yay!)")
            if (shapes[i] == shapesCopy[i]) {
                println("$i: And they are identical (yay!)")
            } else {
                println("$i: But they are not identical (booo!)")
            }
        } else {
            println("$i: Shape objects are the same (booo!)")
        }
    }
}
