import java.util.Random;

public final class AI {
  public static final int choose() {
    return new Random().nextInt(2 - 0 + 1) + 0;
  }
}