import java.util.Random;

public class AI {

  private static AI instance;

  public AI() {
    instance = this;
  }

  public static AI getInstance() {
    if (instance == null) instance = new AI();
    return instance;
  }

  public int choose() {
    return getRandom(0, 2);
  }

  private static int getRandom(int min, int max) {
    Random random = new Random();
    return random.nextInt(max - min + 1) + min;
  }
}
