package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AmazonHooks {

	
@Before("@User2")	
public void setup(Scenario sc) {
	
	System.out.println("Before - launch application");
	System.out.println(sc.getName());
}

	
@Before(order = 1)		
public void setupWizard() {
	
	System.out.println("Before - launch browser");
}

@After()
public void tearDown() {
	
	System.out.println("After - Closing application");
}


/*@AfterStep
public void refresh() {
	
	System.out.println("@Afterstep");
}

*/
}
