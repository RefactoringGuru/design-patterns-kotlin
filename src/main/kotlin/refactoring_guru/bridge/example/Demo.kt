package refactoring_guru.bridge.example

import refactoring_guru.bridge.example.devices.Device
import refactoring_guru.bridge.example.devices.Radio
import refactoring_guru.bridge.example.devices.Tv
import refactoring_guru.bridge.example.remotes.AdvancedRemote
import refactoring_guru.bridge.example.remotes.BasicRemote

/**
 * EN: Demo class. Everything comes together here.
 *
 * RU: Демо-класс. Здесь всё сводится воедино.
 */
fun main() {
    testDevice(Tv())
    testDevice(Radio())
}

private fun testDevice(device: Device) {
    println("Tests with basic remote.")
    val basicRemote = BasicRemote(device)
    basicRemote.power()
    device.printStatus()

    println("Tests with advanced remote.")
    val advancedRemote = AdvancedRemote(device)
    advancedRemote.power()
    advancedRemote.mute()
    device.printStatus()
}
