import java.util.Scanner;
class Trim{
	String trim(String s){
		int si=0,ei=0,i;
		String t = "";
		for(i=0;i<s.length();i++){
			if(s.charAt(i) != ' '){
				si=i;
				break;
			}
		}
		for(i=s.length()-1;i>=0;i--){
			if(s.charAt(i) != ' '){
				ei=i;
				break;
			}
		}
		for(i=si;i<=ei;i++){
			t=t+s.charAt(i);
		}
		return t;
		
	}
}

class Demo{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String:");
		String s1 = scan.nextLine();
		Trim tr = new Trim();
		System.out.println(tr.trim(s1));	
	}
}