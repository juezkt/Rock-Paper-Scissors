public class InputHandler {
  private final int userInput;
  private final int aiInput;

  public InputHandler(final int userInput, final int aiInput) {
    this.userInput = userInput;
    this.aiInput = aiInput;
  }

  public String getResult() {
    if (userInput == Keys.PAPER && aiInput == Keys.PAPER) {
      return Strings.TIE;
    } else if (userInput == Keys.ROCK && aiInput == Keys.ROCK) {
      return Strings.TIE;
    } else if (userInput == Keys.SCISSORS && aiInput == Keys.SCISSORS) {
      return Strings.TIE;
    } else if (userInput == Keys.PAPER && aiInput == Keys.ROCK) {
      return Strings.AI_WIN;
    } else if (userInput == Keys.PAPER && aiInput == Keys.SCISSORS) {
      return Strings.USER_WIN;
    } else if (userInput == Keys.ROCK && aiInput == Keys.PAPER) {
      return Strings.AI_WIN;
    } else if (userInput == Keys.ROCK && aiInput == Keys.SCISSORS) {
      return Strings.USER_WIN;
    } else if (userInput == Keys.SCISSORS && aiInput == Keys.PAPER) {
      return Strings.USER_WIN;
    } else if (userInput == Keys.SCISSORS && aiInput == Keys.ROCK) {
      return Strings.AI_WIN;
    }
    return Strings.INVALID;
  }

  public static final String getInputString(final int input) {
    switch (input) {
      case Keys.ROCK:
        return Strings.ROCK;
      case Keys.PAPER:
        return Strings.PAPER;
      case Keys.SCISSORS:
        return Strings.SCISSORS;
    };
    return Strings.INVALID;
  }
}
