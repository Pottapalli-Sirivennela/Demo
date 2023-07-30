import java.util.*;

class FirstNeven {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    // Write your code here
    int count=2;
    for(int i=1;i<=n;i++)
    {
        System.out.print(count+" ");
        count=count+2;
    }

  }
}