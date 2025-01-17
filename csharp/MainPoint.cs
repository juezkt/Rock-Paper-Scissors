using System;

public class MainPoint
{
  public static void Main(string[] args)
  {
    Console.WriteLine(Strings.GAME_NAME);
    Game.PrintKeys();
    Console.Write(Strings.TYPE_ONE_OF_THESES + ": ");
    int userInput = ToInt(Console.ReadLine());
    int aiInput = AI.Choose();
    Console.WriteLine(Strings.USER_CHOICE + ": " + Game.HandleInput(userInput));
    Console.WriteLine(Strings.AI_CHOICE + ": " + Game.HandleInput(aiInput));
    Console.WriteLine(Game.GetWinMessage(userInput, aiInput));
  }
  
  public static int ToInt(string v)
  {
    if (int.TryParse(v, out int value))
    {
      return Convert.ToInt32(v);
    }
    return 0;
  }
}