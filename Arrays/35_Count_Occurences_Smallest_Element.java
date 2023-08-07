import java.util.Scanner;

class Array35 {
    static int countSmallestElement(int[] a)
    {
        int count=1;
        for(int i=1;i<a.length;i++)
        {
            if(a[0]==a[i])
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        for(int i=0;i<a.length;i++)
        {
            a[i] = scanner.nextInt();
        }
        int result = countSmallestElement(a);
        System.out.println(result);
        
    }
}