class Customer{
	private int cID;
	private String cName;
	private long cNum;

	public Customer(){
		cID = 1;
		cName = "Arul";
		cNum = 9876543210L;
	}

	public Customer(String cName){
		this();
		this.cName = cName;
	}
	
	public Customer(int cID, String cName,long cNum){
		this(cName);
	}
	
	public int getID(){
		return cID;
	}
	public String getName(){
		return cName;
	}
	public long getNum(){
		return cNum;
	}
}

class Demo{
	public static void main(String args[]){
		Customer c1 = new Customer(2,"Alex",8578476597L);
		//c.setData(1,"Alex",8578476597L);
		System.out.println(c1.getID());
		System.out.println(c1.getName());
		System.out.println(c1.getNum());
		/*Customer c2 = new Customer();
		System.out.println(c2.getID());
		System.out.println(c2.getName());
		System.out.println(c2.getNum());*/
	}
}