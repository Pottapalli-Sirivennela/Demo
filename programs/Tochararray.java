import java.util.Scanner;
class Tochararray{
	char[] toCharArray(String s){
		char[] c = new char[s.length()];
		for(int i=0;i<s.length();i++){
			c[i] = s.charAt(i);
		}
		return c;
	}
}

class Demo{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String:");
		String s1 = scan.nextLine();
		Tochararray ca = new Tochararray();
		System.out.println(ca.toCharArray(s1));
	}
}