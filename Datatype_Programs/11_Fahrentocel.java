import java.util.*;

class FahrenToCel{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Write your code here
    int f = scanner.nextInt();
    double c = (f-32)*(double)5/9;
    System.out.printf("%.4f",c);
  }
}