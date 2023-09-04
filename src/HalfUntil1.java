import java.util.Scanner;

public class HalfUntil1 {
  public static void main(String[] args) {
    /*
    Skriv et program, der modtager et (positivt) heltal fra brugeren som en variabel.
    Lad metoden udskrive variablen og halvere den.
    Fortsæt indtil variablen er 1.
     */

    Scanner in = new Scanner(System.in);
    int number;

    System.out.print("Please enter an integer: ");
    number = in.nextInt();

    do {
      number /= 2; // Same as number = number / 2;
      System.out.println("Number in half: " + number);
    } while (number > 1);
  }
}
