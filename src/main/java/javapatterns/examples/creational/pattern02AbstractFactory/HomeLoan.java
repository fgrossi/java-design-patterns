package javapatterns.examples.creational.pattern02AbstractFactory;

public class HomeLoan extends Loan {

	@Override
	public void getInterestRate(double r) {
		rate = r;
	}
}
