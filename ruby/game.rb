require "./constants.rb"
require "./strings.rb"

class Game
  def print_keys
    puts STR_ROCK + ": " + ROCK.to_s
    puts STR_PAPER + ": " + PAPER.to_s
    puts STR_SCISSORS + ": " + SCISSORS.to_s
  end

  def handle_input(input)
    case input
    when ROCK
      return STR_ROCK
    when PAPER
      return STR_PAPER
    when SCISSORS
      return STR_SCISSORS
    else 
      return STR_INVALID
    end
  end

  def get_win_message(user_input, ai_input)
    if user_input == ai_input
      return STR_TIE
    elsif user_input == PAPER && ai_input == ROCK
      return STR_USER_WIN
    elsif user_input == PAPER && ai_input == SCISSORS
      return STR_AI_WIN
    elsif user_input == ROCK && ai_input == PAPER
      return STR_AI_WIN
    elsif user_input == ROCK && ai_input == SCISSORS
      return STR_USER_WIN
    elsif user_input == SCISSORS && ai_input == PAPER
      return STR_USER_WIN
    elsif user_input == SCISSORS && ai_input == ROCK
      return STR_AI_WIN
    else
      return STR_INVALID
    end
  end
end
