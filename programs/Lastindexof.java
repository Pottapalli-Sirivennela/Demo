import java.util.Scanner;
class Lastindexof{
	int lastIndexof(String s,String c){
		char k = c.charAt(0);
		int i;
		for(i=(s.length()-1);i>=0;i--){
			if(s.charAt(i)==k  ){
				return i;
			}	
		}
		return -1;
	}
}

class Demo{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String:");
		String s1 = scan.nextLine();
		String c1 = scan.nextLine();
		Lastindexof li = new Lastindexof();
		System.out.println(li.lastIndexof(s1,c1));
	}
}