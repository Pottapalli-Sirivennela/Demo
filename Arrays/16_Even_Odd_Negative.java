import java.util.Scanner;
class Array16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // implement your logic here
        int[] a = new int[N];
        int i=0;
        for(i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<a.length;i++)
        {
            if(a[i]<0)
            {
                System.out.print(a[i]+" ");
            }
        }
        System.out.println();
        for(i=0;i<a.length;i++)
        {
            if(a[i]>=0)
            {
                if(a[i]%2!=0)
                {
                    System.out.print(a[i]+" ");
                }
            }
        }
        System.out.println();
        for(i=0;i<a.length;i++)
        {
            if(a[i]>=0)
            {
                if(a[i]%2==0)
                {
                    System.out.print(a[i]+" ");
                }
            }
        }
    }
}