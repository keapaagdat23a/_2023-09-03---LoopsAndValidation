import java.util.Scanner;

public class PrintOneToAHundredStart {
  /*
  Spørg brugeren hvor mange stjerner der skal udskrives.
  Brug en while-løkke til at validere, at brugeren skriver et tal mellem 1 og 100.
  Brug en for-løkke til at udskrive stjernerne.
   */

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int numberOfStars = -1;

    do {
      System.out.print("How many stars (1-100)? ");
      numberOfStars = in.nextInt();
      in.nextLine(); // Scanner bug
    } while (numberOfStars < 1 || numberOfStars > 100);

    for (int i = 0; i < numberOfStars; i++)
      System.out.print('*');
  }
}
