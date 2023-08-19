import java.util.Scanner;

class String11 {
    static void stringReverse(String input){
        for(int i=input.length()-1;i>=0;i--){
            System.out.print(input.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        stringReverse(input);
    }
}