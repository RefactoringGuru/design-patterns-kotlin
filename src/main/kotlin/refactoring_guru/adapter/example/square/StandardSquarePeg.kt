package refactoring_guru.adapter.example.square

import kotlin.math.pow

data class StandardSquarePeg(override val width: Double) : SquarePeg {

    override val square: Double = width.pow(2)
}