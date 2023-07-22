import java.util.*;

class CircleArea{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Write your code here
    int radius = scanner.nextInt();
    double pi = 3.142;
    double area = pi*radius*radius;
    System.out.printf("%.4f",area);
  }
}