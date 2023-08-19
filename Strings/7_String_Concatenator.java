import java.util.Scanner;

class String7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        String res = input1.concat(input2);
        System.out.println(res);
    }
}