import java.util.Scanner;

class String3 {
    static void printCharNum(String input){
        int count = 0;
        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            if((c>='A' && c<='Z') || (c>='a' && c<='z') || (c>=48 && c<=57)){
                System.out.print(c+" ");
                count=1;
            }
        }
        if(count==0){
            System.out.println("No characters or numbers found.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        printCharNum(input);
    }
}