#include <stdio.h>
#include "constants.h"
#include "game.h"

int main() {
  int user_input;

  printf("RockPaperScissors\n");

  print_keys();

  printf("Type one of these keys\n");
  scanf("%i", & user_input);

  char * handled_user_input = handle_input(user_input);
  printf("Your choose: %s\n", handled_user_input);

  return 0;
}
