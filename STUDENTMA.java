package demo;

class Student{
	
	String name;
	int roll_no;
	int SB1,SB2,SB3;
	int total;
	float avg;
	Student(String name,int roll_no,int SB1,int SB2,int SB3){
		this.name=name;
		this.roll_no=roll_no;
		this.SB1=SB1;
		this.SB2=SB2;
		this.SB3=SB3;
		average();
		
	}
	void average() {
		total=SB1+SB2+SB3;
		avg=total/3;
	}
	void DisplayDetails() {
		System.out.println("Name:  "+this.name);
		System.out.println("ROLL_NO:  "+this.roll_no);
		System.out.println("Marks obtained in SUBJECT 1:  "+this.SB1);
		System.out.println("Marks obtained in SUBJECT 2:  "+this.SB2);
		System.out.println("Marks obtained in SUBJECT:  "+this.SB3);
		System.out.println("Total marks obtained:  "+total);
		System.out.println("Average marks obtinede:  "+avg);
		
		
		
	}
	
public class STUDENTMA {
	public static void main(String[] aargs) {
		Student student1=new Student("DAWN",34,89,98,95);
		Student student2=new Student("JHONS",45,86,82,96);
		System.out.println("The details of student 1 is");
		student1.DisplayDetails();
		System.out.println("The details of student 2 is");
		student2.DisplayDetails();
		
	}
}

}
