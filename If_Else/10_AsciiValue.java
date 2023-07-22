import java.util.Scanner;

class Asciivalue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.nextLine().charAt(0);
        System.out.println((int)c);
    }
}