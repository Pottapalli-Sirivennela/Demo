import java.util.*;

class Multiple_2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    // Write your code here
    for(int i=2;i<=n;i++)
    {
      if(i%2==0)
      {
        System.out.print(i+" ");
      }
    }
  }
}