import java.util.Scanner;

public class AskUntilQuit {
  public static void main(String[] args) {
    String text = "";
    Scanner in = new Scanner(System.in);

    while(!text.equals("quit")) {
      System.out.print("Please type string: ");
      text = in.nextLine();
      text = text.trim().toLowerCase();
      System.out.println("You typed: " + text);
    }
  }
}
