import java.util.Scanner;

class String4 {
    static void printCharNum(String input){
        int count = 0;
        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            if((c>='A' && c<='Z') || (c>='a' && c<='z') || (c>=48 && c<=57) || c==' '){
                
            }
            else{
                System.out.print(c+" ");
                count=1;
            }
        }
        if(count==0){
            System.out.println("No special characters found.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        printCharNum(input);
    }
}