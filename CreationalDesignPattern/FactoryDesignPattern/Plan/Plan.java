package CreationalDesignPattern.FactoryDesignPattern.Plan;

import java.util.* ;

abstract class Plan {
	protected double rate;

	abstract double getRate();

	public double calculateBill(int units) {
		return rate*units ;
	}
}