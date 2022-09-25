package refactoring_guru.abstract_factory.example.buttons

/**
 * EN: All products families have the same varieties (MacOS/Windows).
 *
 * This is another variant of a button.
 *
 * RU: Все семейства продуктов имеют одни и те же вариации (MacOS/Windows).
 *
 * Это вариант кнопки под Windows.
 */
class WindowsButton : Button {

    override fun paint() {
        println("You have created WindowsButton.")
    }
}
