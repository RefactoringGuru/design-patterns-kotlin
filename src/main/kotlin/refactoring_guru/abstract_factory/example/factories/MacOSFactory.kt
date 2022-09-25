package refactoring_guru.abstract_factory.example.factories

import refactoring_guru.abstract_factory.example.buttons.Button
import refactoring_guru.abstract_factory.example.buttons.MacOSButton
import refactoring_guru.abstract_factory.example.checkboxes.Checkbox
import refactoring_guru.abstract_factory.example.checkboxes.MacOSCheckbox

/**
 * EN: Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 *
 * RU: Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
class MacOSFactory : GUIFactory {

    override fun createButton(): Button = MacOSButton()

    override fun createCheckbox(): Checkbox = MacOSCheckbox()
}
