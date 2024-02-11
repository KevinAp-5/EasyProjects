package Sum;

import java.util.Random;

public class Somar {
  private Random random = new Random();
  public int A;
  public int B;

  public Somar(int a, int b) {
    this.A = a;
    this.B = b;
  }

  public Somar() {
    this.A = random.nextInt(9999);
    this.B = random.nextInt(9999);
  }

  public int Sum(int a, int b) {
    return Integer.sum(a, b);
  }

  public int Sum() {
    return Integer.sum(this.A, this.B);
  }
}
