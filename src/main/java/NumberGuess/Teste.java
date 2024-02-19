package NumberGuess;

public class Teste {
  public static void main(String[] args) {
    NumberGuess guess = new NumberGuess(10);
    boolean acertou = false;
    while (!acertou) {
      int numero = guess.getUserInput();
      acertou = guess.pickNumber(numero);
    }
  }
}
