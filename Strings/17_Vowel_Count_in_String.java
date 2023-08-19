import java.util.Scanner;

class String17 {
    static int vowelCount(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if( c=='a' || c=='e' || c=='i' || c=='o' || c=='u' 
             || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
                count++;
             }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int res = vowelCount(input);
        System.out.println(res);
    }
}