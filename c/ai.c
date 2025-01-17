#include <time.h>
#include <stdlib.h>
#include "ai.h"
#include "constants.h"

int ai_choose() {
  srand(time(NULL));
  int random_input = rand() % 3;
  return random_input;
}
