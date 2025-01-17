import kotlin.random.Random

class AI private constructor() {
  companion object {
    @Volatile
    private var instance: AI? = null

    @JvmStatic
    fun getInstance(): AI {
      return instance ?: synchronized(this) {
        instance ?: AI().also { instance = it }
      }
    }
  }

  fun choose(): Int {
    return Random.nextInt(0, 2)
  }
}