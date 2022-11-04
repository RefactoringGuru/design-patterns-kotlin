package refactoring_guru.builder.example.cars

import refactoring_guru.builder.example.components.Engine
import refactoring_guru.builder.example.components.GPSNavigator
import refactoring_guru.builder.example.components.Transmission
import refactoring_guru.builder.example.components.TripComputer

/**
 * EN: Car manual is another product. Note that it does not have the same
 * ancestor as a Car. They are not related.
 *
 * RU: Руководство автомобиля — это второй продукт. Заметьте, что руководство и
 * сам автомобиль не имеют общего родительского класса. По сути, они независимы.
 */
data class Manual(
    val carType: CarType,
    val seats: Int,
    val engine: Engine,
    val transmission: Transmission,
    val tripComputer: TripComputer? = null,
    val gpsNavigator: GPSNavigator? = null,
    val fuel: Double = 0.0
) {

    fun print() : String {
        var info = ""
        info += "Type of car: $carType\n"
        info += "Count of seats: $seats\n"
        info += "Engine: volume - " + engine.volume + "; mileage - " + engine.mileage + "\n"
        info += "Transmission: $transmission\n"
        info += if (this.tripComputer != null) {
            "Trip Computer: Functional" + "\n"
        } else {
            "Trip Computer: N/A" + "\n"
        }
        info += if (this.gpsNavigator != null) {
            "GPS Navigator: Functional" + "\n"
        } else {
            "GPS Navigator: N/A" + "\n"
        }
        return info
    }
}
