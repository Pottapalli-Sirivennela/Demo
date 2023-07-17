import java.util.*;

class CelsiusToFahren {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Write your code here
    int c = scanner.nextInt();
    double f = (c*(double)9/5)+32;
    System.out.printf("%.1f",f);
  }
}