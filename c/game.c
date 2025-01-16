#include <stdio.h>
#include <ctype.h>
#include "game.h"
#include "constants.h"

char * handle_input(int input) {
  switch (toupper(input)) {
  case ROCK:
    return "Rock";
  case PAPER:
    return "Paper";
  case SCISSORS:
    return "Scissors";
  default:
    return "Invalid";
  }
}

void print_keys() {
  printf("Rock: %i\n", ROCK);
  printf("Paper: %i\n", PAPER);
  printf("Scissors: %i\n", SCISSORS);
}
