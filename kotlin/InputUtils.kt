fun Int.toInputString(): String {
  return when (this) {
    KEY_ROCK -> STR_ROCK
    KEY_PAPER -> STR_PAPER
    KEY_SCISSORS -> STR_SCISSORS
    else -> STR_INVALID
  }
}