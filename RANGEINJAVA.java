import java.util.Scanner;
public class RANGEINJAVA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number form where you want to start");
		int number= sc.nextInt();
		for(int i=0;i<number;i++) {
			System.out.println("The range of numbers are:"+i);
			
		}
	}



}
