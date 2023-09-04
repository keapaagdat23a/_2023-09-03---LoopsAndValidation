import java.util.Scanner;

public class DoWhileDemo2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int number = 5;

    do {
      System.out.println(number);
      --number;
    } while (number > 10);

    System.out.println("Thanks for playing.");
  }
}
