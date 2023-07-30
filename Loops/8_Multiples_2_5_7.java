import java.util.*;

class Multiples_2_5_7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    // Write your code here
    for(int i=2;i<=n;i++)
    {
      if(i%2==0 || i%5==0 || i%7==0)
      {
        System.out.print(i+" ");
      }
    }
  }
}