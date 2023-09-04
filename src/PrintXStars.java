import java.util.Scanner;

public class PrintXStars {
  /*
  Spørg brugeren hvor mange stjerner der skal udskrives.
  Brug en for-løkke til at udskrive dem.
   */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int number;

    System.out.print("How many stars do you want? ");
    number = in.nextInt();
    in.nextLine(); // Scanner bug

    for (int i = 0; i < number; i++)
      System.out.print('*');
    System.out.println(); // Empty line
  }
}
