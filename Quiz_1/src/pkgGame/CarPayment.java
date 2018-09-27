package pkgGame;

public class CarPayment {
	
	
	
	public CarPayment(int carCost, int downPayment, double interestRate, double lengthOfLoan) {
		// TODO Auto-generated constructor stub
	}

	public double monthlyCarPayment(int carCost, int downPayment, double interestRate, double lengthOfLoan) {
		double monthlyPayment;
		int principal = carCost - downPayment;
		monthlyPayment = (((interestRate/12) * principal)/(1-Math.pow((1 + (interestRate/12)), -lengthOfLoan)));
		return monthlyPayment;
		
	}


	public double totalInterest(int carCost, int downPayment, double interestRate, double lengthOfLoan) {
	
	int principal = carCost - downPayment;
	double totalPaid = principal*(1+ (interestRate*lengthOfLoan));
	
	double totalInterest = totalPaid - principal;
	return totalInterest;
	
	}
}