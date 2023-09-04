import java.util.Scanner;

public class AskUntilMinus1 {
  /*
  Lav et program, der beder brugeren om et heltal.
  Print brugerens input.
  Fortsæt indtil brugeren taster -1.
   */

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int number;

    do {
      System.out.print("Please enter integer: ");
      number = in.nextInt();
      in.nextLine(); // Scanner bug
    } while (number != -1);
  }
}
