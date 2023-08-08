import java.util.Scanner;

class Array43 {
    static void allSubarrays(int[] a,int k)
    {
        int i,j,l;
        for(i=0;i<=a.length-k;i++)
        {
            for(j=i;j<i+k;j++)
            {
                System.out.print(a[j]+" ");
            }
             System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i] = scanner.nextInt();
        }
        allSubarrays(a,k);
    }
}