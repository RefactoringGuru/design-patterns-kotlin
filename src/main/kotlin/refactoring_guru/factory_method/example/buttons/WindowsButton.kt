package refactoring_guru.factory_method.example.buttons

import java.awt.Color
import java.awt.FlowLayout
import java.awt.Font
import javax.swing.*
import kotlin.system.exitProcess

/**
 * EN: Windows button implementation.
 *
 * RU: Реализация нативных кнопок операционной системы.
 */
class WindowsButton : Button {

    override fun render() {
        val label = JLabel("Hello World!").apply {
            isOpaque = true
            background = Color(235, 233, 126)
            font = Font("Dialog", Font.BOLD, 44)
            horizontalAlignment = SwingConstants.CENTER
        }
        val button = JButton("Exit")
        val panel = JPanel().apply {
            layout = FlowLayout(FlowLayout.CENTER)
            add(label)
            add(button)
        }
        val frame = JFrame().apply {
            contentPane.add(panel)
            defaultCloseOperation = JFrame.EXIT_ON_CLOSE
            setSize(320, 200)
            isVisible = true
        }

        button.addActionListener {
            frame.isVisible = false
            exitProcess(0)
        }
    }
}
