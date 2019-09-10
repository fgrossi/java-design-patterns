package javapatterns.examples.factoryMethodPattern;

public class CommercialPlan extends Plan {

	@Override
	void getRate() {
		rate = 7.50;
	}

}
