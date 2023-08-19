import java.util.Scanner;

class String18 {
    static int consonantCount(String s)
    {
        int count = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){
                if(!( ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'
                   || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')){
                    count++;
                   }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int res = consonantCount(input);
        System.out.println(res);
    }
}