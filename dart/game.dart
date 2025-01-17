import './strings.dart';
import './constants.dart';

void printKeys() {
  print("$STR_ROCK: $KEY_ROCK");
  print("$STR_PAPER: $KEY_PAPER");
  print("$STR_SCISSORS: $KEY_SCISSORS");
}

String handleInput(final int input) {
  switch (input) {
    case KEY_ROCK:
      return STR_ROCK;
    case KEY_PAPER:
      return STR_PAPER;
    case KEY_SCISSORS:
      return STR_SCISSORS;
    default:
      return STR_INVALID;
  }
}

String getWinMessage(final int userInput, final int aiInput) {
  if (userInput == aiInput) {
    return STR_TIE;
  } else if (userInput == KEY_PAPER && aiInput == KEY_ROCK) {
    return STR_USER_WIN;
  } else if (userInput == KEY_PAPER && aiInput == KEY_SCISSORS) {
    return STR_AI_WIN;
  } else if (userInput == KEY_ROCK && aiInput == KEY_PAPER) {
    return STR_AI_WIN;
  } else if (userInput == KEY_ROCK && aiInput == KEY_SCISSORS) {
    return STR_USER_WIN;
  } else if (userInput == KEY_SCISSORS && aiInput == KEY_PAPER) {
    return STR_USER_WIN;
  } else if (userInput == KEY_SCISSORS && aiInput == KEY_ROCK) {
    return STR_AI_WIN;
  } else {
    return STR_INVALID;
  }
}