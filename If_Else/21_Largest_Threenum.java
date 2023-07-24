import java.util.Scanner;

class Largest_Threenum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int l = scanner.nextInt();
        if(n>m)
        {
            if(n>l)
            {
                System.out.println(n);
            }
            else
            {
                System.out.println(l);
            }
        }
        else if(m>l)
        {
            System.out.println(m);
        }
        else
        {
            System.out.println(l);
        }
    }
}