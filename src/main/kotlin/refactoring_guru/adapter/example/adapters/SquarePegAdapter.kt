package refactoring_guru.adapter.example.adapters

import refactoring_guru.adapter.example.round.RoundPeg
import refactoring_guru.adapter.example.square.SquarePeg
import kotlin.math.pow
import kotlin.math.sqrt

/**
 * EN: Adapter allows fitting square pegs into round holes.
 *
 * RU: Адаптер позволяет использовать КвадратныеКолышки и КруглыеОтверстия
 * вместе.
 */
class SquarePegAdapter(peg: SquarePeg) : RoundPeg {

    override val radius: Double = sqrt((peg.width / 2).pow(2) * 2)
}
