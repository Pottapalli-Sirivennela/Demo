import java.util.Scanner;

class AbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res;
        if(n<0)
        {
            res = n*(-1);
            System.out.println(res);
        }
        else
        {
            res = n;
            System.out.println(res);
        }
       
    }
}