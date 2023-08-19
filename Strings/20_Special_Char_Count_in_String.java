import java.util.Scanner;

class String20 {
    static int specialCount(String s){
        int count = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if( !((c>='A' && c<='Z') || (c>='a' && c<='z') || (c>='0' && c<='9') || (c==' '))){
                count++;
            }
        } 
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int res = specialCount(input);
        System.out.println(res);
    }
}