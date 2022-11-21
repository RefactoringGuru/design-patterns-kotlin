package refactoring_guru.adapter.example.square

/**
 * EN: SquarePegs are not compatible with RoundHoles (they were implemented by
 * previous development team). But we have to integrate them into our program.
 *
 * RU: КвадратныеКолышки несовместимы с КруглымиОтверстиями (они остались в
 * проекте после бывших разработчиков). Но мы должны как-то интегрировать их в
 * нашу систему.
 */
interface SquarePeg {
    val width: Double
    val square: Double
}
