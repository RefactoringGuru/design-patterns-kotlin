package refactoring_guru.builder.example.components

import refactoring_guru.builder.example.cars.Car

/**
 * EN: Just another feature of a car.
 *
 * RU: Одна из фишек автомобиля.
 */
class TripComputer(var car: Car? = null) {

    fun showFuelLevel() {
        println("Fuel level: " + car?.fuel)
    }

    fun showStatus() {
        if (car?.engine?.started == true) {
            println("Car is started")
        } else {
            println("Car isn't started")
        }
    }
}
