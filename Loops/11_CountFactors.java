import java.util.*;

class CountFactors {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    // Write your code here
    int count=0;
    for(int i=1;i<=n;i++)
    {
      if(n%i==0)
      {
        count++;
      }
    }
    System.out.print(count);
  }
}