import java.util.Scanner;

class NumberAscii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n>=48 && n<=57)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}