public class Citizen{

	private String name;
	private double yearlyEarning;

	public void setName(String citizenName){
	name = citizenName;

}


	public void setEarning(double citizenEarning){
	yearlyEarning= citizenEarning;

}


	public double getYearlyIncomeTax(){
	
	TaxCalculator calculator= new TaxCalculator();
	double tax = calculator.calculateTax(yearlyEarning);
		return tax;


}



}