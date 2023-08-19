import java.util.Scanner;

class String16 {
    static int spaceCount(String input){
        int count = 0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)==' '){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int res = spaceCount(input);
        System.out.println(res);
    }
}