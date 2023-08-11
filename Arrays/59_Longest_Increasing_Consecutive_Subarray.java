import java.util.Scanner;

class Array59 {

    static void longestIncreasingSubarray(int[] a){
        int si=0,ei=0,start=0,end=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i+1]-a[i]==1){
                ei++;
            }
            else{
                if((ei-si)>(end-start))
                {
                    start = si;
                    end = ei;
                }
                si=i+1;
                ei=i+1;
            }
        }
        if((ei-si)>(end-start)){
            start = si;
            end = ei;
        }
        for(int i=start;i<=end;i++){
            System.out.print(a[i]+" ");
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i] = scanner.nextInt();
        }
        longestIncreasingSubarray(a);
    }
}