public class InputHandler {
  private final int userInput;
  private final int aiInput;

  public InputHandler(final int userInput, final int aiInput) {
    this.userInput = userInput;
    this.aiInput = aiInput;
  }

  public String getResult() {
    if (userInput == Keys.PAPER && aiInput == Keys.PAPER) {
      return declareDraw();
    } else if (userInput == Keys.ROCK && aiInput == Keys.ROCK) {
      return declareDraw();
    } else if (userInput == Keys.SCISSORS && aiInput == Keys.SCISSORS) {
      return declareDraw();
    } else if (userInput == Keys.PAPER && aiInput == Keys.ROCK) {
      return declareAiWin();
    } else if (userInput == Keys.PAPER && aiInput == Keys.SCISSORS) {
      return declareUserWin();
    } else if (userInput == Keys.ROCK && aiInput == Keys.PAPER) {
      return declareAiWin();
    } else if (userInput == Keys.ROCK && aiInput == Keys.SCISSORS) {
      return declareUserWin();
    } else if (userInput == Keys.SCISSORS && aiInput == Keys.PAPER) {
      return declareUserWin();
    } else if (userInput == Keys.SCISSORS && aiInput == Keys.ROCK) {
      return declareAiWin();
    }
    return "Invalid";
  }

  public static final String getInputString(final int input) {
    switch (input) {
      case Keys.ROCK:
        return "Rock";
      case Keys.PAPER:
        return "Paper";
      case Keys.SCISSORS:
        return "Scissors";
    };
    return "Invalid";
  }

  private String declareAiWin() {
    return "Ai Win";
  }

  private String declareUserWin() {
    return "User Win";
  }

  private static final String declareDraw() {
    return "Draw";
  }
}
