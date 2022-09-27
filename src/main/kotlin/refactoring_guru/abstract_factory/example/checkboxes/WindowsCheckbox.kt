package refactoring_guru.abstract_factory.example.checkboxes

/**
 * EN: All products families have the same varieties (MacOS/Windows).
 *
 * This is another variant of a checkbox.
 *
 * RU: Все семейства продуктов имеют одинаковые вариации (MacOS/Windows).
 *
 * Вариация чекбокса под Windows.
 */
class WindowsCheckbox : Checkbox {

    override fun paint() {
        println("You have created WindowsCheckbox.")
    }
}
