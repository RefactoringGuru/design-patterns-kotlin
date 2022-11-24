package refactoring_guru.singleton.example.parameters.thread_safe

import kotlin.concurrent.thread

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
    thread {
        val singleton = Singleton.getInstance("FOO")
        println(singleton.value)
    }
    thread {
        val singleton = Singleton.getInstance("BAR")
        println(singleton.value)
    }
}
