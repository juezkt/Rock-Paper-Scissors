import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println(Strings.GAME_NAME);
    System.out.print(Strings.TYPE_ONE_OF_THESES + ": \n" + getKeysMessage());
    final Scanner input = new Scanner(System.in);
    final int userInput = input.nextInt();
    final int aiInput = getAI().choose();
    final InputHandler inputHandler = new InputHandler(userInput, aiInput);
    System.out.println(Strings.USER_CHOICE + ": " + inputHandler.getInputString(userInput));
    System.out.println(Strings.AI_CHOICE + ": " + inputHandler.getInputString(aiInput));
    System.out.println(inputHandler.getResult());
  }

  private static final AI getAI() {
    return AI.getInstance();
  }

  private static final String getKeysMessage() {
    final String message;
    message = 
      Strings.ROCK + ": " + Keys.ROCK + "\n" +
      Strings.PAPER + ": " + Keys.PAPER + "\n" +
      Strings.SCISSORS + ": " + Keys.SCISSORS
      + "\n";
    return message;
  }
}
