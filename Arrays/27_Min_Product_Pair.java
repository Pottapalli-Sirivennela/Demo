import java.util.Scanner;

class Array27 {

    static long MinProductPair(int[] a)
    {
        long pro = Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            long mul = Integer.MAX_VALUE;
            for(int j=0;j<a.length;j++)
            {
                if(j!=i)
                {
                    mul=a[i]*a[j];
                }
                if(mul<pro)
                {
                    pro=mul;
                }
            }
        }
        return pro;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        long result = MinProductPair(a);
        System.out.println(result);
    }
}