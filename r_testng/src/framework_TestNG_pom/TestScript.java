package framework_TestNG_pom;

import org.testng.annotations.Test;

public class TestScript extends Base_class {
	
	@Test(dataProvider = "signupdata", dataProviderClass = data_provider_class.class)
	public void signup(String fn,String ln,String mail,String pass)
	{
		pom_class pmc = new pom_class(driver);
	
		pmc.reg_link();
		pmc.gender();
		pmc.firstname(fn);
		pmc.lastname(ln);
		pmc.mail(mail);
		pmc.password(pass);
		pmc.con_pass(pass);
		pmc.regbtn();
		
	}

}
