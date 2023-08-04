import java.util.Scanner;

class Array23 {

    public static int findSecondSmallest(int[] array) {
        // Write your code here
        int first_small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]<first_small)
            {
                second_small = first_small;
                first_small = array[i];
            }
            else if(array[i]<second_small && array[i]!=first_small)
            {
                second_small = array[i];
            }
        }
        return second_small;
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