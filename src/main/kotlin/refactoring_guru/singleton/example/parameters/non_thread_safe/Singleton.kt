package refactoring_guru.singleton.example.parameters.non_thread_safe

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

        private var instance: Singleton? = null

        fun getInstance(value: String) = instance ?: Singleton(value).also { instance = it }
    }
}
