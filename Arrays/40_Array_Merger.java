import java.util.Scanner;

class Array40 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a1 = new int[n];
        for(int i=0;i<a1.length;i++)
        {
            a1[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] a2 = new int[m];
        for(int i=0;i<a2.length;i++)
        {
            a2[i] = scanner.nextInt();
        }
        int k=n+m;
        int[] c = new int[k];
        for(int i=0;i<c.length;i++)
        {
            if(i<n)
            {
                c[i] = a1[i];
            }
            else
            {
                c[i] = a2[i-n];
            }
        }
        System.out.print("Merged array: ");
        for(int i=0;i<c.length;i++)
        {
            System.out.print(c[i]+" ");
        }
    }
}