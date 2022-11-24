package refactoring_guru.singleton.example.no_parameters

/**
 * EN: Main function. Everything comes together here.
 *
 * RU: Основна функція. Здесь всё сводится воедино.
 */
fun main() {
    val singletonOne = Singleton
    val singletonTwo = Singleton
    singletonOne.value = "Hello world!"
    println("Singleton one says ${singletonOne.value}")
    println("Singleton two says ${singletonTwo.value}")
}
