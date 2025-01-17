using System;

public class AI 
{
  public static int Choose()
  {
    return new Random().Next(0, 2);
  }
}