import java.util.Scanner;
class CommonFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // implement your logic here
        int min;
        if(n<m)
        {
            min=n;
        }
        else
        {
            min=m;
        }
        for(int i=1;i<=min;i++)
        {
            if(n%i==0 && m%i==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}