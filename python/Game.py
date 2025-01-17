from Constants import ROCK, PAPER, SCISSORS
from Strings import STR_ROCK, STR_PAPER, STR_SCISSORS, STR_INVALID, STR_TIE, STR_AI_WIN, STR_USER_WIN

def print_keys():
  print(STR_ROCK + ": "+ str(ROCK))
  print(STR_PAPER + ": "+ str(PAPER))
  print(STR_SCISSORS + ": "+ str(SCISSORS))

def handle_input(input):
  match input:
    case int(ROCK):
      return STR_ROCK
    case int(PAPER):
      return STR_PAPER
    case int(SCISSORS):
      return STR_SCISSORS
    case _:
      return STR_INVALID

def get_win_message(user_input, ai_input):
  if user_input == ai_input:
    return STR_TIE
  elif user_input == PAPER and ai_input == ROCK:
    return STR_AI_WIN
  elif user_input == PAPER and ai_input == SCISSORS:
    return STR_USER_WIN
  elif user_input == ROCK and ai_input == PAPER:
    return STR_AI_WIN
  elif user_input == ROCK and ai_input == SCISSORS:
    return STR_USER_WIN
  elif user_input == SCISSORS and ai_input == PAPER:
    return STR_USER_WIN
  elif user_input == SCISSORS and ai_input == ROCK:
    return STR_AI_WIN
  else:
    return STR_INVALID