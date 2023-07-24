import java.util.Scanner;

class MultiOrAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if(n%2==0 && m%2==0)
        {
            System.out.println(n*m);
        }
        else
        {
            System.out.println(n+m);
        }

        
    }
}