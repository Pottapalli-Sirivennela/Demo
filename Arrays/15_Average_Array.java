import java.util.Scanner;
class Array15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // implement your logic here
        int[] a = new int[N];
        int i=0;
        float avg;
        int sum=0;
        for(i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        avg = (float)sum/N;
        System.out.printf("%.2f",avg);
    }
}