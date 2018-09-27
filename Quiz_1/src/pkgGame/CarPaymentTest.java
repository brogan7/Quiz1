package pkgGame;

import org.junit.Test;

public class CarPaymentTest {
	
	@Test
	public double monthlyCarPayment_Test() {
		double monthlyPayment; 
		
		boolean correctPayment = false; 
	
		int carCost = 40000;
		int downPayment = 5000;
		double interestRate = 0.10;
		double lengthOfLoan = 60;
		
		CarPayment p1 = new CarPayment(carCost, downPayment, interestRate, lengthOfLoan);
		double expectedValue = 743.65;
		double value;
		value = p1.monthlyCarPayment();   //Telling me to create the monthlyCarPayment in the CarPayment class, I already have this method
		
		if(expectedValue == value) {
			correctPayment = true;
			
		}
	}
	
	return correctPayment
		
			
			
}