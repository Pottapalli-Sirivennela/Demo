import java.util.HashMap;
import java.util.Scanner;

class Array34 {

    static void countOccurrences(int[] a)
    {
        int count = 1;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]==a[i+1])
            {
                count++;
            }
            else
            {
                System.out.println(a[i]+" "+count);
                count=1;
            }
        }
        System.out.println(a[a.length-1]+" "+count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        for(int i=0;i<a.length;i++)
        {
            a[i] = scanner.nextInt();
        }
        countOccurrences(a);
    }
}