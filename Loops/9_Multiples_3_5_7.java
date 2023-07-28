import java.util.*;

class Multiples_3_5_7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    // Write your code here
    int count=0,num=3;
    while(count<n)
    {
      if(num%3==0 || num%5==0 || num%7==0)
      {
        System.out.print(num+" ");
        count++;
      }
      num++;
    }
  }
}