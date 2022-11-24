package refactoring_guru.adapter.example.round

/**
 * EN: RoundHoles are compatible with RoundPegs.
 *
 * RU: КруглоеОтверстие совместимо с КруглымиКолышками.
 */
data class RoundHole(val radius: Double) {

    fun fits(peg: RoundPeg) = radius >= peg.radius
}
