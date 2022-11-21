package refactoring_guru.adapter.example

import refactoring_guru.adapter.example.adapters.SquarePegAdapter
import refactoring_guru.adapter.example.round.RoundHole
import refactoring_guru.adapter.example.round.StandardRoundPeg
import refactoring_guru.adapter.example.square.StandardSquarePeg

/**
 * EN: Demo class. Everything comes together here.
 *
 * RU: Демо-класс. Здесь всё сводится воедино.
 */
fun main() {
    // EN: Round fits round, no surprise.
    //
    // RU: Круглое к круглому — всё работает.
    val roundHole = RoundHole(5.0)
    val roundPeg = StandardRoundPeg(5.0)
    if (roundHole.fits(roundPeg)) {
        println("Round peg r5 fits round hole r5.")
    }

    val smallSquarePeg = StandardSquarePeg(2.0)
    val largeSquarePeg = StandardSquarePeg(20.0)
    // EN: roundHole.fits(smallSquarePeg) // Won't compile.
    //
    // RU: roundHole.fits(smallSquarePeg) // Не скомпилируется.

    // EN: Adapter solves the problem.
    //
    // RU: Адаптер решит проблему.
    val smallSquarePegAdapter = SquarePegAdapter(smallSquarePeg)
    val largeSquarePegAdapter = SquarePegAdapter(largeSquarePeg)
    if (roundHole.fits(smallSquarePegAdapter)) {
        println("Square peg w2 fits round hole r5.")
    }
    if (!roundHole.fits(largeSquarePegAdapter)) {
        println("Square peg w20 does not fit into round hole r5.")
    }
}
