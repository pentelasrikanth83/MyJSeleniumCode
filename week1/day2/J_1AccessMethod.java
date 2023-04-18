 package week1.day2;

public class J_1AccessMethod {

	int sal=200000;
	String name="Srikanth";
	
	public String myName() {
		String nam="Srinu";
		return nam;
	}

	private int mySalary() {
		int salary = 80000;
		return salary;
	}
	
	
	double addTwoNum(double a, double b) {

		return a + b;
	}
	public static void main(String[] args) {
		J_1AccessMethod obj=new J_1AccessMethod();
		//Access the methods and variables
		int sal2 = obj.sal;
		System.out.println("Second month salary:"+sal2);
		String name2 = obj.name;
		System.out.println(name2);
		double addTwoNum = obj.addTwoNum(20.30, 50.60);
		System.out.println(addTwoNum);
		String myName = obj.myName();
		System.out.println(myName);
		int mySalary = obj.mySalary();
		System.out.println(mySalary);
		
		
		
	}

}
