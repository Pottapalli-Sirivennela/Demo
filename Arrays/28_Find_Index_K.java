import java.util.*;
import java.util.Scanner;
class Array28 {

    static int findIndex(int[] a,int k)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==k)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=scanner.nextInt();
        }
        int k = scanner.nextInt();
        int res = findIndex(a,k);
        System.out.println(res);
    }
}