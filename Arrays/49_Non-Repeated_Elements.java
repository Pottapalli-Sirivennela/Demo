import java.util.*;

class Array49 {

    static void notCommonElements(int[] arr1,int[] arr2)
    {
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i] != arr2[j])
            {
                if(arr1[i]<arr2[j])
                {
                    System.out.print(arr1[i]+" ");
                    i++;
                }
                else 
                {
                    System.out.print(arr2[j]+" ");
                    j++;
                }
            }
            else
            {
                i++;
                j++;
            }
        }
        while(i<arr1.length)
        {
            System.out.print(arr1[i]+" ");
            i++;
        }
        while(j<arr2.length)
        {
            System.out.print(arr2[j]+" ");
            j++;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i] = scanner.nextInt();
        }
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i] = scanner.nextInt();
        }
        notCommonElements(arr1,arr2);
    }
}