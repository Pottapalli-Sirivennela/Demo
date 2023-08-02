import java.util.Scanner;
class Array20 {
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
        int large=a[0];
        for(i=1;i<a.length;i++)
        {
            if(a[i]>large)
            {
                large=a[i];
            }
        }
        /*System.out.println(large);*/
        int count=0;
        for(i=0;i<a.length;i++)
        {
            if(large==a[i])
            {
                count++;
            }
        }
        System.out.println(count);
    }
}