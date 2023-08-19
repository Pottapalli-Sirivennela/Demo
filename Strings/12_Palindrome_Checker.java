import java.util.Scanner;

class String12 {
    static boolean isPalindrome(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if(isPalindrome(input)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}