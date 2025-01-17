#include <stdio.h>
#include <ctype.h>
#include "game.h"
#include "constants.h"
#include "strings.h"

const char * handle_input(int input) {
  switch (toupper(input)) {
  case ROCK:
    return STR_ROCK;
  case PAPER:
    return STR_PAPER;
  case SCISSORS:
    return STR_SCISSORS;
  default:
    return STR_INVALID;
  }
}

void print_keys() {
  printf("%s: %i\n", STR_ROCK, ROCK);
  printf("%s: %i\n", STR_PAPER, PAPER);
  printf("%s: %i\n", STR_SCISSORS, SCISSORS);
}

const char *get_win_message(int userInput, int aiInput) {
  if (userInput == aiInput) {
    return STR_TIE;
  } else if (userInput == PAPER && aiInput == ROCK) {
    return STR_AI_WIN;
  } else if (userInput == PAPER && aiInput == SCISSORS) {
    return STR_USER_WIN;
  } else if (userInput == ROCK && aiInput == PAPER) {
    return STR_AI_WIN;
  } else if (userInput == ROCK && aiInput == SCISSORS) {
    return STR_USER_WIN;
  } else if (userInput == SCISSORS && aiInput == PAPER) {
    return STR_USER_WIN;
  } else if (userInput == SCISSORS && aiInput == ROCK) {
    return STR_AI_WIN;
  }
  return STR_INVALID;
}
