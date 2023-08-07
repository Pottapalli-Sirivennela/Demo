import java.util.Scanner;

class Array33 {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 int N = scanner.nextInt();
 int[] a = new int[N];
 int i;
 for(i=0;i<a.length;i++)
 {
    a[i]=scanner.nextInt();
 }
 int K = scanner.nextInt();
 int count=0;
 for(i=0;i<a.length;i++)
 {
    if(a[i]==K)
    {
        count++;
    }
 }
 System.out.println(count);
 }
}