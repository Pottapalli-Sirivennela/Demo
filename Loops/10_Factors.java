import java.util.*;

class Factors {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    // Write your code here
    for(int i=1;i<=n;i++)
    {
      if(n%i==0)
      {
        System.out.print(i+" ");
      }
    }
  }
}