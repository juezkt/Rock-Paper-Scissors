import java.util.Scanner;

public class Main {
  public static final void main(String[] args) {
    System.out.println(Strings.GAME_NAME);
    Game.printKeys();

    final Scanner input = new Scanner(System.in);

    final int userInput = input.nextInt();
    final int aiInput = AI.choose();

    System.out.println(Strings.USER_CHOICE + ": " + Game.handleInput(userInput));
    System.out.println(Strings.AI_CHOICE + ": " + Game.handleInput(aiInput));

    System.out.println(Game.getWinMessage(userInput, aiInput));
  }
}
