import java.util.*;

class Dollartoinr {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Write your code here
    int dollar = scanner.nextInt();
    double inr = dollar*82.73;
    System.out.printf("%.4f",inr);
  }
}