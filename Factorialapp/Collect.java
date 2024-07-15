import java.util.Scanner;
public class Collect{

	public static void main(String...args){
		Scanner sc= new Scanner(System.in);
		int number= 0;
		int evenTotal = 0;
		int oddTotal = 0;

		for(int count= 1; count<=10; count++){
			
			System.out.println("Enter a number");
				number= sc.nextInt();

	

			if(number % 2 ==0){
				evenTotal += number;

				

	}

				
			else if(number % 2 ==1){
				
				oddTotal += number;
				

}

}

	System.out.println("the total of even numbers is " + evenTotal);
	System.out.println("the total of odd numbers is " + oddTotal);


}

}


			

			
	
			 

			