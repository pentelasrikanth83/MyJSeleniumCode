package week1.day2;

public class J_2AccessCardDetails {

	public String personName() {
		String name = "Kanth";
		return name;
	}

	 private int cardNum() {
		return 2356;
	}

	{
		System.out.println("Block of code");
	}

	public static void staticName() {
		System.out.println("static name");
	}
	
	public static void main(String[] args) {
		
		J_1AccessMethod chaild=new J_1AccessMethod();
		String name = chaild.name;
		System.out.println(name);
		
	}
}
