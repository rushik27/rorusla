package framework_TestNG_pom;

import org.testng.annotations.DataProvider;

public class data_provider_class {
	
	@DataProvider(name= "signupdata")
	public String[][] data()
	{
		String [][] arr = {{"ronaldo","cristiano","cri@gmail.com","password"}};
		return arr;
				
	}
	

}
