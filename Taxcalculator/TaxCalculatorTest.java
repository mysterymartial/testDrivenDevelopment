import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TaxCalculatorTest{


	@Test
	public void testCalculateTax(){
		//given
		TaxCalculator calculator = new TaxCalculator();
		//when
		double tax= calculator.calculateTax(30_000);
		//aseert
		assertEquals(4_500,tax);

}



	@Test
	public void testCalculateTaxForInvalidAmount(){
		//given
		TaxCalculator calculator = new TaxCalculator();
		//when
		double tax= calculator.calculateTax(-30_000);
		//aseert
		assertThrows(RuntimeException.class, ()-> calculator.calculateTax (-30_000));



}

}