import java.util.*;

class PrimeCheck {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    // Write your code here
    int count=0;
    for(int i=2;i<=n;i++)
    {
      if(n%i==0)
      {
        count++;
      }
    }
    if(count==1)
    {
      System.out.print("Yes");
    }
    else
    {
      System.out.print("No");
    }
  }
}