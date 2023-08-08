import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Array45 {
    static void longestSubarray(int[] a,int k){
        for(int size=a.length;size>=1;size--){
            for(int i=0;i<=a.length-size;i++){
                int sum = 0;
                for(int j=i;j<i+size;j++){
                    sum = sum + a[j];
                }
                if(sum==k){
                    for(int j=i;j<i+size;j++){
                        System.out.print(a[j]+" ");
                    }
                    System.out.println();
                    return;
                }
            }
        }
        System.out.println("No subarray found.");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i] = scanner.nextInt();
        }
        longestSubarray(a,k);
    }
}