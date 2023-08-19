import java.util.Scanner;

class String9 {
    static void indexCharPrinter(String input,int k){
        if(k<input.length()){
            System.out.println(input.charAt(k));
        }
        else{
            System.out.println("Invalid index");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int k = scanner.nextInt();
        indexCharPrinter(input,k);
    }
}