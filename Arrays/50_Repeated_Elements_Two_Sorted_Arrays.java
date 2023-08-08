import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Array50 {

    static void commonElements(int[] arr1,int[] arr2){
        int i=0,j=arr2.length-1;
        while(i<arr1.length && j>=0){
            if(arr1[i] == arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
                j--;
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }
            else{
                j--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0;i<arr1.length;i++){
            arr1[i] = scanner.nextInt();
        }
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0;i<arr2.length;i++){
            arr2[i] = scanner.nextInt();
        }
        commonElements(arr1,arr2);
    }
}