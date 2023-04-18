package week1.day1;

public class J_04LearnGradeIf {

	public static void main(String[] args) {
		
		int marks=102;
		//80-100=A
		//60-79=B
		//35-59=C
		//<35=Fail
		if(marks<=100 && marks>=80) {
			System.out.println(" 'A' Grade");
		}else if(marks<80 && marks>=60 ) {
			System.out.println(" 'B' Grade");
		}else if(marks<60 && marks>=35) {
			System.out.println(" 'C' Grade");
		}else if(marks<35){
			System.out.println(" F Grade");
		}else if(marks>100) {
			System.out.println("Please Check your Input Details");
		}
	}
}
