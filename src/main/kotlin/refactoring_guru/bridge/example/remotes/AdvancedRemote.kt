package refactoring_guru.bridge.example.remotes

import refactoring_guru.bridge.example.devices.Device

class AdvancedRemote(device: Device) : BasicRemote(device) {

    fun mute() {
        println("Remote: mute")
        device.volume = 0
    }
}
