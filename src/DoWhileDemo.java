import java.util.Scanner;

public class DoWhileDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String text = "";

    do {
      System.out.print("\nPlease enter text: ");
      text = in.nextLine();
      System.out.print("You entered: " + text);
    } while (!text.equals("quit"));
  }
}
