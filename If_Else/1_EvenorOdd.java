import java.util.*;

class EvenorOdd {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    // Write your code here
    if(num%2==0)
    {
      System.out.println("Even");
    }
    else
    {
      System.out.println("Odd");
    }
  }
}