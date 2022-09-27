package refactoring_guru.factory_method.example;

import refactoring_guru.factory_method.example.factory.Dialog
import refactoring_guru.factory_method.example.factory.HtmlDialog
import refactoring_guru.factory_method.example.factory.WindowsDialog

/**
 * EN: Main function. Everything comes together here.
 * All of the client code should work with factories and products
 * through abstract interfaces. This way it does not care which factory it
 * works with and what kind of product it returns.
 *
 * RU: Основна функція. Здесь всё сводится воедино.
 * Весь остальной клиентский код работает с фабрикой и продуктами только
 * через общий интерфейс, поэтому для него неважно какая фабрика была
 * создана.
 */
fun main() {
    val dialog = createDialog()
    dialog.renderWindow()
}

/**
 * EN: The concrete factory is usually chosen depending on configuration or
 * environment options.
 *
 * RU: Приложение создаёт определённую фабрику в зависимости от конфигурации
 * или окружения.
 */
private fun createDialog(): Dialog = if (System.getProperty("os.name").equals("Windows 10")) {
    WindowsDialog()
} else {
    HtmlDialog()
}
