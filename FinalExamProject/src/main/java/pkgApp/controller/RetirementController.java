package pkgApp.controller;

import java.net.URL;
import java.util.ResourceBundle;
import jave.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import pkgApp.RetirementApp;

public class RetirementController implements Initializable {

		
	private RetirementApp mainApp = null;
	
	@FXML
	private TextField txtSaveEachMonth;
	private TextField txtYearsToWork;
	private TextField txtAnnualReturnsWorking;
	private TextField txtNeedToSave;
	private TextField txtYearsRetired;
	private TextField txtAnnualReturns;
	private TextField txtRequiredIncome;
	private TextField txtMonthlySSI;

	public RetirementApp getMainApp() {
		return mainApp;
	}

	public void setMainApp(RetirementApp mainApp) {
		this.mainApp = mainApp;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {		
	}
	
	@FXML
	public void btnClear(ActionEvent event) {
		System.out.println("Clear pressed");
		txtSaveEachMonth.clear();
		txtYearsToWork.clear();
		txtAnnualReturnsWorking.clear();
		txtNeedToSave.clear();
		txtYearsRetired.clear();
		txtAnnualReturns.clear();
		txtRequiredIncome.clear();
		txtMonthlySSI.clear();
		//	TODO: Clear all the text inputs
	}
	
	@FXML
	public void btnCalculate(ActionEvent event) {
		double monthly = retire.AmountToSave();
		double alltime = retire.TotalAmountSaved();
		//	TODO: Call AmountToSave and TotalAmountSaved and populate 
		txtSaveEachMonth.setText(monthly);
		txtNeedToSave.setText(alltime);
	}
	@FXML
	public void btnEnter(ActionEvent event) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter years of work ");
		int wyears = scan.nextInt();
		System.out.println("Enter Annual percentage return while working ");
		double aprw = scan.nextDouble();
		System.out.println("Enter years retired ");
		int ryears = scan.nextInt();
		System.out.println("Enter Annual return while retired ");
		double aprr = scan.nextDouble();
		System.out.println("Enter required income ");
		double income = scan.nextDouble();
		System.out.println("Enter Monthly SSI ");
		double ssi = scan.nextDouble();
		txtYearsToWork.setText(wyears);
		txtAnnualReturnsWorking.setText(aprw);
		txtYearsRetired.setText(ryears);
		txtAnnualReturns.setText(aprr);
		txtRequiredIncome.setText(income);
		txtMonthlySSI.setText(ssi);
		retire.setYearsToWork(wyears);
		retire.setYearsRetired(ryears);
		retire.setAnnualReturnWorking(aprw);
		retire.setAnnualReturnRetired(aprr);
		retire.setRequiredIncome(income);
		retire.setMonthlySSI(ssi);
	}
}
