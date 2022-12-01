package refactoring_guru.bridge.example.devices

interface Device {
    var enabled: Boolean

    var volume: Int

    var channel: Int

    fun printStatus()
}
