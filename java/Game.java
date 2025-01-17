public final class Game {
  public static final void printKeys() {
    final String message =
      Strings.ROCK + ": " + Constants.ROCK + "\n" +
      Strings.PAPER + ": " + Constants.PAPER + "\n" +
      Strings.SCISSORS + ": " + Constants.SCISSORS
      + "\n";
    System.out.print(message);
    System.out.print(Strings.TYPE_ONE_OF_THESES + ":\n");
  }

  public static final String handleInput(final int input) {
    switch (input) {
      case Constants.ROCK:
        return Strings.ROCK;
      case Constants.PAPER:
        return Strings.PAPER;
      case Constants.SCISSORS:
        return Strings.SCISSORS;
    };
    return Strings.INVALID;
  }

  public static final String getWinMessage(final int userInput, final int aiInput) {
    if (userInput == aiInput) {
      return Strings.TIE;
    } else if (userInput == Constants.PAPER && aiInput == Constants.ROCK) {
      return Strings.USER_WIN;
    } else if (userInput == Constants.PAPER && aiInput == Constants.SCISSORS) {
      return Strings.AI_WIN;
    } else if (userInput == Constants.ROCK && aiInput == Constants.PAPER) {
      return Strings.AI_WIN;
    } else if (userInput == Constants.ROCK && aiInput == Constants.SCISSORS) {
      return Strings.USER_WIN;
    } else if (userInput == Constants.SCISSORS && aiInput == Constants.PAPER) {
      return Strings.USER_WIN;
    } else if (userInput == Constants.SCISSORS && aiInput == Constants.ROCK) {
      return Strings.AI_WIN;
    }
    return Strings.INVALID;
  }
}
