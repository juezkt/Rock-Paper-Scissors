#ifndef GAME_H_INCLUDED
#define GAME_H_INCLUDED

/** return a text to be displayed, based in user input */
const char * handle_input(int input);

/** print all keys available */
void print_keys();

/** returns who win **/
const char * get_win_message(int iserInput, int aiInput);

#endif
