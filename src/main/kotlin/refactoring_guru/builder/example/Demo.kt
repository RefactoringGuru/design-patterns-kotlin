package refactoring_guru.builder.example

import refactoring_guru.builder.example.builders.CarBuilder
import refactoring_guru.builder.example.builders.CarManualBuilder
import refactoring_guru.builder.example.director.Director

/**
 * EN: Demo class. Everything comes together here.
 *
 * RU: Демо-класс. Здесь всё сводится воедино.
 */
fun main() {
    val director = Director()

    // EN: Director gets the concrete builder object from the client
    // (application code). That's because application knows better which
    // builder to use to get a specific product.
    //
    // RU: Директор получает объект конкретного строителя от клиента
    // (приложения). Приложение само знает какой строитель использовать,
    // чтобы получить нужный продукт.
    val builder = CarBuilder()
    director.constructSportsCar(builder)

    // EN: The final product is often retrieved from a builder object, since
    // Director is not aware and not dependent on concrete builders and
    // products.
    //
    // RU: Готовый продукт возвращает строитель, так как Директор чаще всего
    // не знает и не зависит от конкретных классов строителей и продуктов.
    val car = builder.getResult()
    println("Car built:\n${car.carType}")

    val manualBuilder = CarManualBuilder()

    // EN: Director may know several building recipes.
    //
    // RU: Директор может знать больше одного рецепта строительства.
    director.constructSportsCar(manualBuilder)
    val carManual = manualBuilder.getResult()
    println("\nCar manual built:\n${carManual.print()}")
}
