package pkgCore;

public class Retirement {

	private int iYearsToWork;
	private double dAnnualReturnWorking;
	private int iYearsRetired;
	private double dAnnualReturnRetired;
	private double dRequiredIncome;
	private double dMonthlySSI;
	
	//TODO: Build the contructor, getters and setters for the attributes above.
	Retirement(int workyears, double workreturn, int retiredyears, double retiredreturn, double income, double ssi){
		iYearsToWork = workyears;
		dAnnualReturnWorking = workreturn;
		iYearsRetired = retiredyears;
		dAnnualReturnRetired = retiredreturn;
		dRequiredIncome = income;
		dMonthlySSI = ssi;
	}
	Retirement(){
		
	};
	public void setYearsToWork(int years) {
		iYearsToWork = years;
	}
	public void setYearsRetired(int years) {
		iYearsRetired = years;
	}
	public void setAnnualReturnWorking(double areturn) {
		dAnnualReturnWorking = areturn;
	}
	public void setAnnualReturnRetired(double areturn) {
		dAnnualReturnRetired = areturn;
	}
	public void setRequiredIncome(double income) {
		dRequiredIncome = income;
	}
	public void setMonthlySSI(double ssi) {
		dMonthlySSI = ssi;
	}
	public int getYearsToWork() {
		return iYearsToWork;
	}
	public int getYearsRetired() {
		return iYearsRetired;
	}
	public double getAnnualReturnWorking() {
		return dAnnualReturnWorking;
	}
	public double getAnnualReturnRetired() {
		return dAnnualReturnRetired;
	}
	public double getRequiredIncome() {
		return dRequiredIncome;
	}
	public double getMonthlySSI() {
		return dMonthlySSI;
	}
	public double AmountToSave()
	{
		//TODO: Determine the amount to save each month based on TotalAmountSaved, YearsToWork
		//		and Annual return while working
		totalamountsaved = TotalAmountSaved();
		double rate = dAnnualReturnWorking/12;
		double amounttosave;
		amounttosave = -rate * (totalamountsaved * Math.pow(1 + rate, iYearsToWork*12) + 0) / (Math.pow(1 + r, nper) - 1);
		return amounttosave;
		return 0;
	}
	
	public double TotalAmountSaved()
	{
		//	TODO: Determine amount to be saved based on Monthly SSI, Required Income, Annual return during retirement
		//		and number of years retired.
		double totalamountsaved;
		double rrate = dAnnualReturnRetired/12;
		totalamountsaved = (((1 - Math.pow(1 + rrate, iYearsRetired*12)) / rrate) * (dRequiredIncome - dMonthlySSI) * (1 + rrate)) / Math.pow(1 + rate, iYearsRetired*12);
		return totalamountsaved;
		return 0;
	}
}
