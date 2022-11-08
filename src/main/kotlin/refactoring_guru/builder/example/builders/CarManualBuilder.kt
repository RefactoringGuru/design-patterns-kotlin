package refactoring_guru.builder.example.builders

import refactoring_guru.builder.example.cars.CarType
import refactoring_guru.builder.example.cars.Manual
import refactoring_guru.builder.example.components.Engine
import refactoring_guru.builder.example.components.GPSNavigator
import refactoring_guru.builder.example.components.Transmission
import refactoring_guru.builder.example.components.TripComputer

/**
 * EN: Unlike other creational patterns, Builder can construct unrelated
 * products, which don't have the common interface.
 *
 * In this case we build a user manual for a car, using the same steps as we
 * built a car. This allows to produce manuals for specific car models,
 * configured with different features.
 *
 * RU: В отличие от других создающих паттернов, Строители могут создавать
 * совершенно разные продукты, не имеющие общего интерфейса.
 *
 * В данном случае мы производим руководство пользователя автомобиля с помощью
 * тех же шагов, что и сами автомобили. Это устройство позволит создавать
 * руководства под конкретные модели автомобилей, содержащие те или иные фичи.
 */
class CarManualBuilder : Builder {

    private lateinit var type: CarType
    private var seats: Int = 0
    private lateinit var engine: Engine
    private lateinit var transmission: Transmission
    private var tripComputer: TripComputer? = null
    private var gpsNavigator: GPSNavigator? = null

    override fun setCarType(type: CarType) {
        this.type = type
    }

    override fun setSeats(seats: Int) {
        this.seats = seats
    }

    override fun setEngine(engine: Engine) {
        this.engine = engine
    }

    override fun setTransmission(transmission: Transmission) {
        this.transmission = transmission
    }

    override fun setTripComputer(tripComputer: TripComputer?) {
        this.tripComputer = tripComputer
    }

    override fun setGPSNavigator(gpsNavigator: GPSNavigator?) {
        this.gpsNavigator = gpsNavigator
    }

    fun getResult(): Manual = Manual(type, seats, engine, transmission, tripComputer, gpsNavigator)
}
