import java.util.Scanner;

class String13 {
    static String toLowercase(String input){
        String s = "";
        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            if(c>='A' && c<='Z'){
                s = s + (char)(c+32);
            }
            else{
                s = s + c;
            }
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String res = toLowercase(input);
        System.out.println(res);
    }
}