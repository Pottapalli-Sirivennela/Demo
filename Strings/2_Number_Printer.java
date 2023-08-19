import java.util.Scanner;

class String2 {
    static void printNumbers(String input){
        int count = 0;
        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            if(c>=48 && c<=57){
                System.out.print(c+" ");
                count++;
            }
        }
        if(count==0){
            System.out.print("No numbers found.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        printNumbers(input);
    }
}