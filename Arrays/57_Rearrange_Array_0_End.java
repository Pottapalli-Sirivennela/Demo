import java.util.Scanner;

class Array57 {

    static int[] rearrangeArray(int[] a){
        int i=0,j=0;
        while(i<a.length){
            if(a[i]==0){
                i++;
            }
            else{
                a[j]=a[i];
                i++;
                j++;
            }
        }
        while(j<a.length){
            a[j]=0;
            j++;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i] = scanner.nextInt();
        }
        int[] res = rearrangeArray(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}