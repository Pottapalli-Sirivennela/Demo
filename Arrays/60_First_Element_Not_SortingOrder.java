import java.util.Scanner;

class Array60 {
    static void notInSorting(int[] a){
        int k = 0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]<a[i+1]){

            }
            else{
                System.out.println(a[i+1]);
                k++;
                return;
            }
        }
        if(k==0){
            System.out.println("-1");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i] = scanner.nextInt();
        }
        notInSorting(a);
    }
}