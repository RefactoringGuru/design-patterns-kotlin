package refactoring_guru.factory_method.example.factory

import refactoring_guru.factory_method.example.buttons.Button;
import refactoring_guru.factory_method.example.buttons.HtmlButton;

/**
 * EN: HTML Dialog will produce HTML buttons.
 *
 * RU: HTML-диалог.
 */
class HtmlDialog : Dialog() {

    override fun createButton(): Button = HtmlButton()
}
