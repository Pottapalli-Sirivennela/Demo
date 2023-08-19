import java.util.Scanner;

class String1 {
    static void printCharacters(String input){
        int count=0;
        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            if((c>='A' && c<='Z') || (c>='a' && c<='z')){
                System.out.print(c+" ");
                count++;
            }
        }
        if(count==0){
            System.out.print("No valid characters found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        printCharacters(input);
    }
}