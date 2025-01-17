using System;

public class Game
{
  public static void PrintKeys()
  {
    Console.WriteLine(Strings.ROCK + ": " + Constants.ROCK);
    Console.WriteLine(Strings.PAPER + ": " + Constants.PAPER);
    Console.WriteLine(Strings.SCISSORS + ": " + Constants.SCISSORS);
  }

  public static String HandleInput(int input)
  {
    switch (input) {
      case Constants.ROCK:
        return Strings.ROCK;
      case Constants.PAPER:
        return Strings.PAPER;
      case Constants.SCISSORS:
        return Strings.SCISSORS;
      default:
        return Strings.INVALID;
    }
  }
  
  public static String GetWinMessage(int userInput, int aiInput)
  {
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