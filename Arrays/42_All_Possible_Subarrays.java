import java.util.Scanner;

class Array42 {
    static void allSubarrays(int[] a)
    {
        int i,j,k;
        for(i=0;i<a.length;i++)
        {
            for(j=i;j<a.length;j++)
            {
                for(k=i;k<=j;k++)
                {
                    System.out.print(a[k]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i] = scanner.nextInt();
        }
        allSubarrays(a);
    }
}