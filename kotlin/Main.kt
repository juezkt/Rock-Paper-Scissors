val keysMessage =
  "$STR_ROCK: $KEY_ROCK\n$STR_PAPER: $KEY_PAPER\n$STR_SCISSORS: $KEY_SCISSORS"

fun main(vararg args: String) {
  println(STR_GAME_NAME)
  println("$STR_TYPE_ONE_OF_THESES:\n$keysMessage");

  val userChoice = try {
    readLine()?.let {
      it.toInt()
    } ?: KEY_ROCK
  } catch (e: Exception) {
    KEY_ROCK
  }
  val aiChoice = AI.getInstance().choose()

  val inputHandler = InputHandler(userChoice, aiChoice)
  println("$STR_USER_CHOICE: ${userChoice.toInputString()}")
  println("$STR_AI_CHOICE: ${aiChoice.toInputString()}")

  println(inputHandler.getResult())
}