package CreationalDesignPattern.FactoryDesignPattern.Plan;

import java.util.* ;

public abstract class Plan {
	protected double rate;

	public abstract double getRate();

	public double calculateBill(int units) {
		return rate*units ;

	}
}