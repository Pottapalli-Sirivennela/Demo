import java.util.Scanner;

class Array36 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        int i;
        for(i=0;i<a.length;i++)
        {
            a[i]=scanner.nextInt();
        }
        int large=a[0];
        for(i=1;i<a.length;i++)
        {
            if(a[i]>large)
            {
                large=a[i];
            }
        }
        int count=0;
        for(i=0;i<a.length;i++)
        {
            if(a[i]==large)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}