import java.util.Scanner;

class Array25 {

    static int minPairSum(int[] array)
    {
        int first_small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]<first_small)
            {
                second_small = first_small;
                first_small = array[i];
            }
            else if(array[i]<second_small)
            {
                second_small = array[i];
            }
        }
        int result = first_small+second_small;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i] = scanner.nextInt();
        }
        int res = minPairSum(a);
        System.out.println(res);
        
    }
}