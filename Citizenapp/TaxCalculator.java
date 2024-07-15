public class TaxCalculator{

	public double calculateTax (double income){

	if(income < 0) throw new RuntimeException("invalid amount must be greater than 0");

	double tax= 0;
	if (income<= 30_000){
		tax= income * 0.15;

}

	else {

		tax= income * 0.2;


}


		return tax;




}

}	