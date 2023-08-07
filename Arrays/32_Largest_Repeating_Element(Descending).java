import java.util.Scanner;

class Array32 {
    static int largestRepetingElement(int[] a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]==a[i+1])
            {
                return a[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        for(int i=0;i<a.length;i++)
        {
            a[i]=scanner.nextInt();
        }
        int result = largestRepetingElement(a);
        System.out.println(result);
        
    }
}