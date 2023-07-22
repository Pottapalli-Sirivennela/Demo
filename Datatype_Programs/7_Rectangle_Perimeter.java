import java.util.*;

class Rectangle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Write your code here
    int l = scanner.nextInt();
    int b = scanner.nextInt(); 
    int perimeter = 2*(l+b);
    System.out.println(perimeter);
  }
}