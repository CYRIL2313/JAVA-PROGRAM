/*Problem Statement:
You are asked to create a Java class Student that keeps track of the number of student objects
created using a static variable.
Each time a new Student object is created, the counter should increase automatically. Also, create a
method to display the number of students created so far.
Requirements:
1.Create a class Student with:
•A non-static variable name to store the student's name.
•A static variable studentCount to store the total number of students created.
•A constructor that accepts the student name and increases the count.
•A static method getStudentCount() that returns the value of studentCount.
2.In the Main class:
•Create 3 Student objects with names.
•Print the number of students using the static method.*/


package pack1;

class Student {
     String name;
     static int studentCount;
     
     Student (String name) {
	
    	 this.name=name;
    	 
    	 studentCount++;
    	 
     }
        public String getStudentname(){
        System.out.println("Enter the studnet name");
		 	 return name;
     }
     public static int getStudentcount() {
    	 return studentCount;
     }
}
     
     public class Staticmember{
    	 public static void main(String [] args) {
    		 Student s1 = new Student("dawn");
    		 System.out.println(Student.getStudentcount());
    		 Student s2 = new Student("johns");
    		 System.out.println(Student.getStudentcount());
    		 Student s3 = new Student("kritthick");
    		 System.out.println(Student.getStudentcount());
    		
		}
    	 
     }
     
     
     


