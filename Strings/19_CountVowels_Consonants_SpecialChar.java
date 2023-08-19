import java.util.Scanner;

class String19 {
    static void vowelConsonantSpecialCount(String s){
        int vowel = 0;
        int consonant = 0;
        int special = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if( !((c>='A' && c<='Z') || (c>='a' && c<='z') || (c>='0' && c<='9') || (c==' '))){
                special++;
            }
            else if((c>='A' && c<='Z') || (c>='a' && c<='z')){
                if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U'
                  || c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                    vowel++;
                }
                else{
                    consonant++;
                }
            }
        }
        System.out.println("Vowels: "+vowel);
        System.out.println("Consonants: "+consonant);
        System.out.println("Special Characters: "+special);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        vowelConsonantSpecialCount(input);
    }
}