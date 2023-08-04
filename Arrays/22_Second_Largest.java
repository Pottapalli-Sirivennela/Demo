import java.util.*;

class Array22 {

    public static int findSecondLargest(int[] arr) {
        // write your code here
        int first_large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>first_large)
            {
                second_large = first_large;
                first_large = arr[i];
            }
            else if(arr[i]>second_large && arr[i]!=first_large)
            {
                second_large = arr[i];
            }
        }
        return second_large;
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=scanner.nextInt();
        }
        int res = findSecondLargest(a);
        System.out.println(res);
    }
}