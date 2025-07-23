import java.util.Scanner;

public class GRADINGSYSTEMBYMARKENTERING {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks = sc.nextInt();
		if(marks>=90) {
			System.out.println("GRADE A");
		}
		else if(marks>=75) {
			System.out.println("GRADE B");
		}
		else if(marks>=60) {
			System.out.println("GRADE C");
		}
		else if(marks>=40) {
			System.out.println("GRADE D");
		}
		else if(marks<40) {
			System.out.println("GRADE F : FAIL");
		}
		else {
			System.out.println("INVALID INPUT");
		}
		
	}
}
