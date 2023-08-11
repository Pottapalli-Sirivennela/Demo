import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Array52 {
    static void printRepeatingOdd(int[] a1,int[] a2){
        int i=0,j=0,x=0;
        while(i<a1.length && j<a2.length){
            if(a1[i]==a2[j]){
                if(a1[i]%2!=0){
                    System.out.print(a1[i]+" ");
                    x++;
                }
                i++;
                j++;
            }
            else if(a1[i]<a2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        if(x==0){
            System.out.println("No common odd elements found.");
        }
    } 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int[] a1 = new int[n1];
        for(int i=0;i<a1.length;i++){
            a1[i] = scanner.nextInt();
        }
        int n2 = scanner.nextInt();
        int[] a2 = new int[n2];
        for(int i=0;i<a2.length;i++){
            a2[i] = scanner.nextInt();
        }
        printRepeatingOdd(a1,a2);
    }
}