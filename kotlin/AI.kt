import kotlin.random.Random

object AI {
  @JvmStatic inline fun choose(): Int = Random.nextInt(0, 2)
}