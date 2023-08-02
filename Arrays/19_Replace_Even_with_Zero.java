import java.util.Scanner;
class Array19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // implement your logic here
        int[] a = new int[N];
        int i;
        for(i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                System.out.print("0"+" ");
            }
            else
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}