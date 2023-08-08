import java.util.Scanner;

class Array41 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s1 = scanner.nextInt();
        int[] arr1 = new int[s1];
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i] = scanner.nextInt();
        }
        int s2 = scanner.nextInt();
        int[] arr2 = new int[s2];
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i] = scanner.nextInt();
        }
        int s3 = scanner.nextInt();
        int[] arr3 = new int[s3];
        for(int i=0;i<arr3.length;i++)
        {
            arr3[i] = scanner.nextInt();
        }
        int len = s1+s2+s3;
        int[] res = new int[len];
        for(int i=0;i<res.length;i++)
        {
            if(i<s1)
            {
                res[i] = arr1[i];
            }
            else if(i>=s1 && i<s1+s2)
            {
                res[i] = arr2[i-s1];
            }
            else
            {
                res[i] = arr3[i-(s1+s2)];
            }
        }
        System.out.print("Merged array: ");
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
}