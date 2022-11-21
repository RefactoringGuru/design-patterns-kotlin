package refactoring_guru.singleton.example.parameters.thread_safe

class Singleton {

    val value: String

    constructor(value: String) {
        // EN: The following code emulates slow initialization.
        //
        // RU: Этот код эмулирует медленную инициализацию.
        try {
            Thread.sleep(1000)
        } catch (ex: InterruptedException) {
            ex.printStackTrace()
        }
        this.value = value
    }

    companion object {

        @Volatile private var instance: Singleton? = null

        fun getInstance(value: String) = instance ?: synchronized(this) {
            instance ?: Singleton(value).also { instance = it }
        }
    }
}
