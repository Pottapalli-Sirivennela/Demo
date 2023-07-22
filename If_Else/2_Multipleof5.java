import java.util.*;

class Multipleof5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    // Write your code here
    if(num%5==0)
    {
      System.out.println("Yes");
    }
    else
    {
      System.out.println("No");
    }
  }
}