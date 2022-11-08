package refactoring_guru.builder.example.director

import refactoring_guru.builder.example.builders.Builder
import refactoring_guru.builder.example.cars.CarType
import refactoring_guru.builder.example.components.Engine
import refactoring_guru.builder.example.components.GPSNavigator
import refactoring_guru.builder.example.components.Transmission
import refactoring_guru.builder.example.components.TripComputer

/**
 * EN: Director defines the order of building steps. It works with a builder
 * object through common Builder interface. Therefore it may not know what
 * product is being built.
 *
 * RU: Директор знает в какой последовательности заставлять работать строителя.
 * Он работает с ним через общий интерфейс Строителя. Из-за этого, он может не
 * знать какой конкретно продукт сейчас строится.
 */
class Director {

    fun constructSportsCar(builder: Builder) {
        builder.run {
            setCarType(CarType.SPORTS_CAR)
            setSeats(2)
            setEngine(Engine(3.0, 0.0))
            setTransmission(Transmission.SEMI_AUTOMATIC)
            setTripComputer(TripComputer())
            setGPSNavigator(GPSNavigator())
        }
    }

    fun constructCityCar(builder: Builder) {
        builder.run {
            setCarType(CarType.CITY_CAR)
            setSeats(2)
            setEngine(Engine(1.2, 0.0))
            setTransmission(Transmission.AUTOMATIC)
            setTripComputer(TripComputer())
            setGPSNavigator(GPSNavigator())
        }
    }

    fun constructSUV(builder: Builder) {
        builder.run {
            setCarType(CarType.SUV)
            setSeats(4)
            setEngine(Engine(2.5, 0.0))
            setTransmission(Transmission.MANUAL)
            setGPSNavigator(GPSNavigator())
        }
    }
}
