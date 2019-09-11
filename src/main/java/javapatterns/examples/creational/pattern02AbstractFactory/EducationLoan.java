package javapatterns.examples.creational.pattern02AbstractFactory;

public class EducationLoan extends Loan {

	@Override
	public void getInterestRate(double r) {
		rate = r;
	}

}
