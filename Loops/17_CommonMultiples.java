import java.util.Scanner;
class CommonMultiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // implement your logic here
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        commonMultiples(n,a,b);
    }

    public static void commonMultiples(int n, int a, int b) {
        int count=0;
        int i=1;
        while(count<n)
        {
            int multiple = a*i;
            if(multiple%b==0)
            {
                System.out.print(multiple+" ");
                count++;
            }
            i++;
        }
        
    }
}