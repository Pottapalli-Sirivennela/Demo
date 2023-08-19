import java.util.Scanner;

class String6 {
    static void oddIndexCharPrinter(String input){
        int count = 0;
        for(int i=0;i<input.length();i++){
            if(i%2!=0){
                System.out.print(input.charAt(i)+" ");
                count = 1;
            }
        }
        if(count==0){
            System.out.print("No characters found at odd indices.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        oddIndexCharPrinter(input);
    }
}