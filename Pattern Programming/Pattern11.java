import java.util.Scanner;

class Pattern11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // TODO: Write code to generate square pattern
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }  
                                      
    }
}