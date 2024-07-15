import java.util.Scanner;
public class CitizenMain{

	public static void main(String...args){
	Citizen citizen = new Citizen();
	TaxCalculator calculator = new TaxCalculator();
	Scanner sc= new Scanner(System.in);
	double amount= 0;
	System.out.println("Enter your name");
	String name= sc.next();

	System.out.println("Enter your earnings");
	double earning= sc.nextDouble();
	amount= calculator.calculateTax(amount);
	System.out.println(amount);

	
	

}


}