import java.util.Scanner;
class Array21 {
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
        int small=a[0];
        for(i=1;i<a.length;i++)
        {
            if(a[i]<small)
            {
                small=a[i];
            }
        }
        int count=0;
        for(i=0;i<a.length;i++)
        {
            if(a[i]==small)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}