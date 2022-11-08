package refactoring_guru.builder.example.builders

import refactoring_guru.builder.example.cars.CarType
import refactoring_guru.builder.example.components.Engine
import refactoring_guru.builder.example.components.GPSNavigator
import refactoring_guru.builder.example.components.Transmission
import refactoring_guru.builder.example.components.TripComputer

/**
 * EN: Builder interface defines all possible ways to configure a product.
 *
 * RU: Интерфейс Строителя объявляет все возможные этапы и шаги конфигурации
 * продукта.
 */
interface Builder {
    fun setCarType(type: CarType)
    fun setSeats(seats: Int)
    fun setEngine(engine: Engine)
    fun setTransmission(transmission: Transmission)
    fun setTripComputer(tripComputer: TripComputer?)
    fun setGPSNavigator(gpsNavigator: GPSNavigator?)
}
