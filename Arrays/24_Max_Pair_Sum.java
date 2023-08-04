import java.util.Scanner;

class Array24 {

    public static int findSecondSmallest(int[] array) {
        // Write your code here
        int first_large = Integer.MIN_VALUE;
        int second_large = Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>first_large)
            {
                second_large = first_large;
                first_large = array[i];
            }
            else if(array[i]>second_large)
            {
                second_large = array[i];
            }
        }
        int result = first_large + second_large;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for(int i=0;i<array.length;i++)
        {
            array[i] = scanner.nextInt();
        }
        int res = findSecondSmallest(array);
        System.out.println(res);
    }
}