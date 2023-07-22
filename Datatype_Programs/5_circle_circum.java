import java.util.*;
class Circumference {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int radius = scanner.nextInt();
    // Write your code here
    float pi = 3.142f;
    float circum = 2*pi*radius;
    System.out.printf("%.4f",circum);
  }
}