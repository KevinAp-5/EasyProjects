package NumberGuess;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
  Random random = new Random();

  private final int randomNumber;

  public NumberGuess(int maxNumber) {
    this.randomNumber = this.random.nextInt(maxNumber);
    System.out.println("Número máximo agora é " + maxNumber);
  }

  public NumberGuess() {
    this.randomNumber = new Random(100).nextInt();
  }

  public boolean pickNumber(int userNumber) {
    if (userNumber > this.randomNumber) {
      System.out.println("Escolheu um número MAIOR.");
      return false;
    }
    if (userNumber < this.randomNumber) {
      System.out.println("Escolheu um número MENOR.");
      return false;

    }

    System.out.println("Acertou o número!");
    return true;
  }

  public int getUserInput() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Advinhe o número: ");
    int userInput;
    userInput = scanner.nextInt();
    return userInput;
  }
}
