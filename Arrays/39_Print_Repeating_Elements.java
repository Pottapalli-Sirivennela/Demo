import java.util.Scanner;

class Array39 {

    static void repeatingElements(int[] a)
    {
        int count = 1;
        int start = 1;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]==a[i+1])
            {
                count++;
            }
            else 
            {
                if(count>1)
                {
                    System.out.print(a[i]+" ");
                }
                else 
                {
                    start++;
                }
                count=1;
            }
        }
        if(count>1)
        {
            System.out.print(a[a.length-1]);
        }
        if(start==a.length)
        {
            System.out.println("-1");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        for(int i=0;i<a.length;i++)
        {
            a[i] = scanner.nextInt();
        }
        repeatingElements(a);
    }
}