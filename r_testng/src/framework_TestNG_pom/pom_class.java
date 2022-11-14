package framework_TestNG_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_class {
	
	//declarations
	@FindBy(xpath= "//a[.='Register']")
    private WebElement reg;
    
    @FindBy(xpath="//input[@id= 'gender-male']")
    private WebElement maleRadio;
    
    @FindBy(id="FirstName")
    private WebElement first_name;
    
    @FindBy(id= "LastName")
    private WebElement last_name;
    
    @FindBy(id="Email")
    private WebElement Email;
    
    @FindBy(id="Password")
    private WebElement passw;
    
    @FindBy(id= "ConfirmPassword")
    private WebElement cinfirm;
    
    @FindBy(id="register-button")
    private WebElement reg_btn;
    
    //initialization
    public pom_class(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    
    //utilization
    public void reg_link()
    {
    	reg.click();
    }
    public void gender()
    {
    	maleRadio.click();
    }
    public void firstname(String first) 
    {
	  first_name.sendKeys(first);	
	}
    
    public void lastname(String last) 
    {
	   last_name.sendKeys(last);	
	}
    public void mail(String email) 
    {
		Email.sendKeys(email);
	}
    public void password(String pass)  
    {
		passw.sendKeys(pass);
	}
    public void con_pass(String cpass) 
    {
		cinfirm.sendKeys(cpass);
	}
    public void regbtn() 
    {
    	reg_btn.click();
		
	}
    
    
    
	

}
