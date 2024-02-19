package ReverseString;

import java.util.Scanner;

public class Teste {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um texto: ");
    String userInput = scanner.nextLine();
    ReverseString reverse = new ReverseString(userInput);
    System.out.println(reverse.revert());
  }
}
