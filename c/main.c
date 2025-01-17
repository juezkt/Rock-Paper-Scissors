#include <stdio.h>
#include "constants.h"
#include "game.h"
#include "ai.h"
#include "strings.h"

int main() {
  int user_input;

  printf("%s\n", STR_GAME_NAME);

  print_keys();

  printf("Type one of these keys\n");
  scanf("%i", & user_input);

  int ai_input = ai_choose();

  const char * handled_ai_input = handle_input(ai_input);
  const char * handled_user_input = handle_input(user_input);

  printf("%s: %s\n", STR_USER_CHOICE,  handled_user_input);
  printf("%s: %s\n", STR_AI_CHOICE, handled_ai_input); 
  printf("%s\n", get_win_message(user_input, ai_input));
  return 0;
}
