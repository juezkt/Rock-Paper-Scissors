require "./game.rb"
require "./strings.rb"
require "./ai.rb"

game = Game.new
game.print_keys

puts "#{STR_TYPE_ONE_OF_THESES}: "

user_input = gets.chomp
ai = AI.new
ai_input = ai.choose

handled_user_input = game.handle_input(user_input.to_i)
handled_ai_input = game.handle_input(ai_input)

puts "#{STR_USER_CHOICE}: #{handled_user_input}"
puts "#{STR_AI_CHOICE}: #{handled_ai_input}"

puts game.get_win_message(user_input.to_i, ai_input.to_i)
