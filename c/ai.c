#include <time.h>
#include <stdlib.h>
#include "ai.h"
#include "constants.h"
#include "game.h"

char * ai_choose() {
  srand(time(NULL));
  int random_input = rand() % 3;
  return handle_input(random_input);
}
