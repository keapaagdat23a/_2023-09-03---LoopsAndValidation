import java.util.Scanner;

public class MultiplyManyTimesUntil {
  public static void main(String[] args) {
    /*
    Lav et program, der lader brugeren indtaste et kommatal. Tallet ganges med pi og resultatet vises.
    Fortsæt indtil brugeren taster 0.
     */

    Scanner in = new Scanner(System.in);
    double number;

    do {
      System.out.print("Please enter a double: ");
      number = in.nextDouble();
      number *= Math.PI;
      System.out.println("New number: " + number);
    } while (number != 0);
  }
}
