import java.util.Scanner;

class Array26 {

    static long MaxProductPair(int[] a)
    {
        long pro = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            long mul = 0;
            for(int j=0;j<a.length;j++)
            {
                if(j!=i)
                {
                    mul=a[i]*a[j];
                }
                if(mul>pro)
                {
                    pro=mul;
                }
            }
        }
        return pro;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=scanner.nextInt(); 
        }
        long result = MaxProductPair(a);
        System.out.println(result);
    }
}