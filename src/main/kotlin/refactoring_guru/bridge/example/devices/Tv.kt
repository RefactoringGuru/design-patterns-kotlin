package refactoring_guru.bridge.example.devices

class Tv : Device {

    override var enabled: Boolean = false

    override var volume: Int = 30
        set(value) {
            field = when {
                value > 100 -> 100
                value < 0 -> 0
                else -> value
            }
        }

    override var channel: Int = 1

    override fun printStatus() {
        println(
            """
              ------------------------------------
              | I'm TV set.
              | I'm ${if(enabled) "enabled" else "disabled"}
              | Current volume is $volume%
              | Current channel is $channel
              ------------------------------------
              
            """.trimIndent()
        )
    }
}
