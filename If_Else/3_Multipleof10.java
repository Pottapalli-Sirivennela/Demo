import java.util.Scanner;

class Multipleof10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n%10==0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}