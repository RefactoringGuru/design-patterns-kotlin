package refactoring_guru.factory_method.example.buttons

/**
 * EN: HTML button implementation.
 *
 * RU: Реализация HTML кнопок.
 */
class HtmlButton : Button {

    override fun render() {
        println("<button>Test Button</button>")
    }
}
