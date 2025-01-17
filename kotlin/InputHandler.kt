class InputHandler(
  private val userInput: Int,
  private val aiInput: Int
) {
  fun getResult(): String {
    return if (userInput == aiInput) {
      STR_TIE
    } else if (userInput == KEY_PAPER && aiInput == KEY_ROCK) {
      STR_USER_WIN
    } else if (userInput == KEY_PAPER && aiInput == KEY_SCISSORS) {
      STR_AI_WIN
    } else if (userInput == KEY_ROCK && aiInput == KEY_PAPER) {
      STR_AI_WIN
    } else if (userInput == KEY_ROCK && aiInput == KEY_SCISSORS) {
      STR_USER_WIN
    } else if (userInput == KEY_SCISSORS && aiInput == KEY_PAPER) {
      STR_USER_WIN
    } else if (userInput == KEY_SCISSORS && aiInput == KEY_ROCK) {
      STR_AI_WIN
    } else {
      STR_INVALID
    }
  }
}