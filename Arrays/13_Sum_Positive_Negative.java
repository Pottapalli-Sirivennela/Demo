import java.util.Scanner;
class Array13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // implement your logic here
        int[] a = new int[N];
        int i=0;
        int pos_sum=0;
        int neg_sum=0;
        for(i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<a.length;i++)
        {
            if(a[i]<0)
            {
                neg_sum=neg_sum+a[i];
            }
            else
            {
                pos_sum=pos_sum+a[i];
            }
        }
        System.out.println(pos_sum);
        System.out.println(neg_sum);
    }
}