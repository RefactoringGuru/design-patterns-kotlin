package refactoring_guru.singleton.example.parameters.non_thread_safe

/**
 * EN: Main function. Everything comes together here.
 *
 * RU: Основна функція. Здесь всё сводится воедино.
 */
fun main() {
    println(
        """
        If you see the same value, then singleton was reused (yay!)
        If you see different values, then 2 singletons were created (booo!!)
        
        RESULT:
        
        """.trimIndent()
    )
    val singletonOne = Singleton.getInstance("FOO")
    val singletonTwo = Singleton.getInstance("BAR")
    println(singletonOne.value)
    println(singletonTwo.value)
}
