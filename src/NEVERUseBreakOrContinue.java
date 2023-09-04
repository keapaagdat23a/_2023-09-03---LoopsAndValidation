public class NEVERUseBreakOrContinue {
  public static void main(String[] args) {

    // Count from 1 to 10
    // WHAT N-O-T TO DO!!!!
    for (int i = 1; i < 100; i++) {
      System.out.print(i);
      if (i == 10)
        break;
      if (i == 5)
        continue;
      System.out.println(i);
    }

  }
}
