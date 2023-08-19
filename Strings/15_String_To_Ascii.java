import java.util.Scanner;

class String15 {
    static void asciiConverter(String input){
        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            System.out.print((int)c+" ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        asciiConverter(input);
       
    }
}