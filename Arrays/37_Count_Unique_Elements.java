import java.util.Scanner;

class Array37 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        int i,j;
        for(i=0;i<a.length;i++)
        {
            a[i] = scanner.nextInt();
        }
        int count=0;
        for(i=0;i<a.length-1;i++)
        {
            if(a[i]!=a[i+1])
            {
                count++;
            }
        }
        System.out.println(count+1);
    }
}