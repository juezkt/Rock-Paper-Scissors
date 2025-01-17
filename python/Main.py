from Constants import ROCK, PAPER, SCISSORS
from Game import print_keys, get_win_message, handle_input
from Strings import STR_GAME_NAME, STR_TYPE_ONE_OF_THESES, STR_USER_CHOICE, STR_AI_CHOICE

import random

def main():
  print(STR_GAME_NAME)
  print_keys()

  user_input = int(input(STR_TYPE_ONE_OF_THESES + ": "))
  ai_input = int(random.choice([ROCK, PAPER, SCISSORS]))

  print(STR_USER_CHOICE + ": " + handle_input(user_input))
  print(STR_AI_CHOICE + ": " + handle_input(ai_input))

  print(get_win_message(user_input, ai_input))

main()