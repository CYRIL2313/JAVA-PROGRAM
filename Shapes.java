package demo;
class Shape {
	public int area(int side){
		System.out.println("I am square");
	    return side*side;
		
		
	}
   public int area(int l,int b) {
	   System.out.println("I am rectangle");
	   return l*b;
   }
   public float area(float radius) {
	   System.out.println("I am circle");
	   return 3.14f*radius*radius;
	   
   }
   
}
public class Shapes {
	public static void main(String[] args) {
		Shape s1 = new Shape();
		System.out.println(s1.area(7));
		System.out.println(s1.area(10, 5));
		System.out.println(s1.area(7));
		
	}
	
}