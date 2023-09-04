import java.util.Scanner;

public class ValidateUserInput {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int number;

    System.out.print("Please enter an INTEGER: ");
    while (!in.hasNextInt())
      in.nextLine();
    number = in.nextInt();

    System.out.println("You entered " + number);
  }
}
