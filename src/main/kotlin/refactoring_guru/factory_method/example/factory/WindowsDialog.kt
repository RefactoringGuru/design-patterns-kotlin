package refactoring_guru.factory_method.example.factory

import refactoring_guru.factory_method.example.buttons.Button
import refactoring_guru.factory_method.example.buttons.WindowsButton

/**
 * EN: Windows Dialog will produce Windows buttons.
 *
 * RU: Диалог на элементах операционной системы.
 */
class WindowsDialog : Dialog() {

    override fun createButton(): Button = WindowsButton()
}
