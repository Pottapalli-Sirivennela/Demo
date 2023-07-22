import java.util.Scanner;

class Multiple4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n%3==0 && n%5==0 && n%7==0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
       
    }
}