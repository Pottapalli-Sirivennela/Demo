import java.util.Scanner;

class Largest_Twonum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if(n>m)
        {
            System.out.println(n);
        }
        else if(m>n)
        {
            System.out.println(m);
        }
        else
        {
            System.out.println(n);
        }
       
    }
}