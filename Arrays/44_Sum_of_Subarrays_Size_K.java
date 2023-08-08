import java.util.Scanner;

class Array44 {
    static void sumOfSubarrays(int[] a,int k)
    {
        int i,j;
        for(i=0;i<=a.length-k;i++)
        {
            int sum = 0;
            for(j=i;j<i+k;j++)
            {
                sum = sum+a[j];
            }
            System.out.print(sum+" ");
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
        sumOfSubarrays(a,k);
    }
}