package refactoring_guru.builder.example.cars

import refactoring_guru.builder.example.components.Engine
import refactoring_guru.builder.example.components.GPSNavigator
import refactoring_guru.builder.example.components.Transmission
import refactoring_guru.builder.example.components.TripComputer

/**
 * EN: Car is a product class.
 *
 * RU: Автомобиль — это класс продукта.
 */
data class Car(
    val carType: CarType,
    val seats: Int,
    val engine: Engine,
    val transmission: Transmission,
    val tripComputer: TripComputer? = null,
    val gpsNavigator: GPSNavigator? = null,
    val fuel: Double = 0.0
) {

    init {
        tripComputer?.car = this
    }
}
