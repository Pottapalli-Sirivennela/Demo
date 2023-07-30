import java.util.*;

class Multiple_3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    // Write your code here
    int ans;
    for(int i=1;i<=n;i++)
    {
      ans=i*3;
      System.out.print(ans+" ");
    }
  }
}