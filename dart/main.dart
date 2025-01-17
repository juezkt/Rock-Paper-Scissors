import 'dart:io';
import './game.dart';
import './strings.dart';
import './ai.dart';

void main() {
  print(STR_GAME_NAME);
  printKeys();
  int? userInput = int.parse(stdin.readLineSync()!);
  int aiInput = aiChoose();
  if (userInput != null) {
    String handledUserInput = handleInput(userInput);
    String handledAiInput = handleInput(aiInput);
    print("$STR_USER_CHOICE: $handledUserInput");
    print("$STR_AI_CHOICE: $handledAiInput");
    print(getWinMessage(userInput, aiInput));
  }
}
