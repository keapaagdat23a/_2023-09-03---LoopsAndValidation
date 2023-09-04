import java.util.Scanner;

public class RecieveEvenInt {
  public static void main(String[] args) {
    int number = -1;
    Scanner in = new Scanner(System.in);

    while (!(number % 2 == 0)) {
      System.out.print("Please enter an integer: ");
      number = in.nextInt();
    }

    System.out.printf("Yes, %d is indeed an integer.", number);
  }
}
