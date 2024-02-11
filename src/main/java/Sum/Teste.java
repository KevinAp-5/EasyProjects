package Sum;

import java.util.Scanner;

public class Teste {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o número A: ");
    int a = scanner.nextInt();

    System.out.println("Digite o número B: ");
    int b = scanner.nextInt();

    scanner.close();
    Somar somas = new Somar(10, 20);
    System.out.println("Soma padrão: " + somas.Sum());
    System.out.println("Sua soma: " + somas.Sum(a, b));
  }
}
