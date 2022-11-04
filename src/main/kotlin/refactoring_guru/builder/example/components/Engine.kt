package refactoring_guru.builder.example.components

/**
 * EN: Just another feature of a car.
 *
 * RU: Одна из фишек автомобиля.
 */
class Engine(val volume: Double, mileage: Double) {
    var mileage: Double = mileage
        private set
    var started: Boolean = false
        private set

    fun on() {
        started = true
    }

    fun off() {
        started = false
    }

    fun go() {
        if (started) {
            this.mileage += mileage
        } else {
            System.err.println("Cannot go(), you must start engine first!")
        }
    }
}
