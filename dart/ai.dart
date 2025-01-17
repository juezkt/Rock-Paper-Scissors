import 'dart:math';

int aiChoose() {
  return random(0, 2);
}

int random(int min, int max) {
  return min + Random().nextInt(max - min);
}
