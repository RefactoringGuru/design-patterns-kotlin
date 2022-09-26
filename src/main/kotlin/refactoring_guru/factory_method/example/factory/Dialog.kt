package refactoring_guru.factory_method.example.factory

import refactoring_guru.factory_method.example.buttons.Button

/**
 * EN: Base factory class. Note that "factory" is merely a role for the class.
 * It should have some core business logic which needs different products to be
 * created.
 *
 * RU: Базовый класс фабрики. Заметьте, что "фабрика" – это всего лишь
 * дополнительная роль для класса. Он уже имеет какую-то бизнес-логику, в
 * которой требуется создание разнообразных продуктов.
 */
abstract class Dialog {

    fun renderWindow() {
        // EN: ... other code ...
        //
        // RU: ... остальной код диалога ...

        val button = createButton()
        button.render()
    }

    /**
     * EN: Subclasses will override this method in order to create specific
     * button objects.
     *
     * RU: Подклассы будут переопределять этот метод, чтобы создавать конкретные
     * объекты продуктов, разные для каждой фабрики.
     */
     abstract fun createButton(): Button
}
