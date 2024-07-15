import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorTest{

	

	@Test
	public void calculatorThatCanCheckTheFactoriaOfnumbers(){

		Factor fact = new Factor();
		int result = fact.calc(2);
		assertEquals (2, result);

}



		

	@Test
	public void checkReverseNumbers (){

	Factor fact = new Factor();
	int result = fact.reverse(12345);
	assertEquals(54321, result);


}

	



		@Test
		public void numberRasiedToPowerNumber (){
		Factor fact = new Factor();
		double result = fact.power(2,3);
		assertEquals(8, result);



}

		@Test
		public void numberRaisedToPowerZero (){
		Factor fact = new Factor();
		double result = fact.power(2,0);
		assertEquals(1,result);

}
		











}