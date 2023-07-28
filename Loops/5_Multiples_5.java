import java.util.*;

class Multiples_5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    // Write your code here
    int ans;
    for(int i=1;i<=n;i++)
    {
      ans=i*5;
      System.out.print(ans+" ");
    }
  }
}