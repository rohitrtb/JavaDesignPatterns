package CreationalDesignPattern.FactoryDesignPattern.Plan;

import java.util.* ;
import java.io.* ;

public class GenerateBill {

	public static void main(String[] args) throws IOException{

		GetPlanFactory planFactory = new GetPlanFactory();

		Plan plan = planFactory.getPlan("DomesticPlan");

		System.out.println("Rate for DomesticPlan: " + plan.getRate());

		System.out.println("Bill for 350 units: " + plan.calculateBill(350));		
	}
}