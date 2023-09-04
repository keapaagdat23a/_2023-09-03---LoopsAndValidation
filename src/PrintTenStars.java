import java.util.Scanner;

public class PrintTenStars {
  /*
  Brug en for-løkke til at udskrive en * (asterisk) 10 gange.
  Udbyg dernæst programmet, så brugeren skal indtaste antallet af stjerner.
  Udbyg igen programmet, så det fortsætter med at spørge brugeren og udskrive stjerner, indtil der tastes 0.
   */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int numberOfStars = -1;

    do {
      System.out.print("\nHow many stars do you want? ");
      numberOfStars = in.nextInt();
      in.nextLine(); // Scanner bug
      for (int i = 0; i < numberOfStars; i++)
        System.out.print('*');
    } while (numberOfStars != 0);
  }
}
