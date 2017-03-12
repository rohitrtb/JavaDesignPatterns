package CreationalDesignPattern.FactoryDesignPattern.Plan;

import java.util.* ;
import java.io.* ;

public class GetPlanFactory {

	public Plan getPlan(String planType) throws IOException {

		System.out.println("Factory method for creating appropriate object based on the input plan");
		Plan plan;

		switch (planType) {
			case "DomesticPlan":
				System.out.println("Creating a DomesticPlan object");
				plan = new DomesticPlan();	
				break;
			case "CommercialPlan":
				System.out.println("Creating a CommercialPlan object");
				plan = new CommercialPlan();
				break;
			case "InstitutionalPlan":
				System.out.println("Creating an InstitutionalPlan object");
				plan = new InstitutionalPlan();
				break;
			default:
				throw new IOException("Invalid input");
		}
		return plan;
	}
}