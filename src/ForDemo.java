public class ForDemo {
  public static void main(String[] args) {
    for (int i = 5; i <= 10; i++) {
      System.out.println(i);
    }

    System.out.println();

    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    }

    String s = "";
    for (int i = 0; i < 10; i++) {
      s += "*";
      System.out.println(s);
    }

    for (char c = 'A'; c <= 'Å'; c++) {
      System.out.print(c);
    }

    char letterA = 'A';
    System.out.print("\n" + (int)letterA);
    System.out.println();

    String text = "Patrick";
    for (int i = text.length() - 1; i >= 0; i--)
      System.out.print(text.charAt(i));

    System.out.println();
    for (int i = 0; i < 10; i++)
      System.out.println("I = " + (i+1));
  }
}
