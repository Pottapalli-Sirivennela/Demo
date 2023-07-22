import java.util.Scanner;

class Threedigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n>99 && n<1000)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        
    }
}