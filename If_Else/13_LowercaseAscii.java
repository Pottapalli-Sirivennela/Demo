import java.util.Scanner;

class LowercaseAscii {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n>=97 && n<=122)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}