class Emp {
    String name;
    int id;
    double salary;
    
    void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
    
    Emp(String name,int id,double salary){
    	  this.name=name;
    	  this.id=id;
    	  this.salary=salary;
    }
}

public class STRUCTEMPLOYY {
    public static void main(String[] args) {
        Emp e1= new Emp("dawn",7483853,500000);
        e1.displayEmployee();
        Emp e2= new Emp("dosil",345345345,40000);
        e2.displayEmployee();
    }
}
	

	
		






