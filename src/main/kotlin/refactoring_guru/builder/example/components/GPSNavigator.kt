package refactoring_guru.builder.example.components

/**
 * EN: Just another feature of a car.
 *
 * RU: Одна из фишек автомобиля.
 */
class GPSNavigator {
    val route: String

    constructor() {
        route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London"
    }

    constructor(manualRoute: String) {
        route = manualRoute
    }
}
