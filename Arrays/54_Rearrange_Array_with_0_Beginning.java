import java.util.Scanner;

class Array54 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        int index=0;
        int[] res = new int[n];
        for(int i=0;i<n;i++)
        {
            if(a[i]==0)
            {
                res[index]=a[i];
                index++;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]!=0)
            {
                res[index]=a[i];
                index++;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
}