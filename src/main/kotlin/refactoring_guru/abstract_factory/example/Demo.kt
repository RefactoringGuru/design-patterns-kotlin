package refactoring_guru.abstract_factory.example;

import refactoring_guru.abstract_factory.example.app.Application;
import refactoring_guru.abstract_factory.example.factories.GUIFactory;
import refactoring_guru.abstract_factory.example.factories.MacOSFactory;
import refactoring_guru.abstract_factory.example.factories.WindowsFactory;

/**
 * EN: Demo class. Everything comes together here.
 *
 * RU: Демо-класс. Здесь всё сводится воедино.
 */
fun main() {
    val app = createApplication()
    app.paint()
}

/**
 * EN: Application picks the factory type and creates it in run time
 * (usually at initialization stage), depending on the configuration or
 * environment variables.
 *
 * RU: Приложение выбирает тип и создаёт конкретные фабрики динамически
 * исходя из конфигурации или окружения.
 */
private fun createApplication(): Application {
    val osName = System.getProperty("os.name").lowercase()
    val factory = if (osName.contains("mac")) MacOSFactory() else WindowsFactory()
    return Application(factory)
}
