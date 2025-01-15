import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("RockPaperScissors");
    System.out.print("Type any of theses" + "\n" + getKeysMessage());
    final Scanner input = new Scanner(System.in);
    final int userInput = input.nextInt();
    final int aiInput = getAI().choose();
    final InputHandler inputHandler = new InputHandler(userInput, aiInput);
    System.out.println("You choose: " + inputHandler.getInputString(userInput));
    System.out.println("AI choose: " + inputHandler.getInputString(aiInput));
    System.out.println("Result: " + inputHandler.getResult());
  }

  private static final AI getAI() {
    return AI.getInstance();
  }

  private static final String getKeysMessage() {
    final String message;
    message = 
      "Rock: " + Keys.ROCK + "\n"
      + "Paper: " + Keys.PAPER + "\n"
      + "Scissors: " + Keys.SCISSORS
      + "\n";
    return message;
  }
}
