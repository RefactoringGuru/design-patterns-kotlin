package refactoring_guru.prototype.caching.cache

import refactoring_guru.prototype.example.shapes.Circle
import refactoring_guru.prototype.example.shapes.Rectangle
import refactoring_guru.prototype.example.shapes.Shape

class BundledShapeCache {
    private val cache = mutableMapOf<String, Shape>()

    init {
        val circle = Circle(
            radius = 45,
            x = 5,
            y = 7,
            color = "Green"
        )

        val rectangle = Rectangle(
            width = 8,
            height = 10,
            x = 6,
            y = 9,
            color = "Blue"
        )

        cache["Big green circle"] = circle
        cache["Medium blue rectangle"] = rectangle
    }

    fun put(key: String, shape: Shape): Shape {
        cache[key] = shape
        return shape
    }

    fun get(key: String): Shape? = cache[key]?.clone()
}
