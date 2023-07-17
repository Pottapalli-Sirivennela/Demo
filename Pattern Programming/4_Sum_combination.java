import java.util.*;

class Sumcombinations {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Write your code here
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    int z = scanner.nextInt();
    int sum1 = x + y;
    int sum2 = x + z;
    int sum3 = y + z;
    System.out.println(sum1);
    System.out.println(sum2);
    System.out.println(sum3);
  }
}