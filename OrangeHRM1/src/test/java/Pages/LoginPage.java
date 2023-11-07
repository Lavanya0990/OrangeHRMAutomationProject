package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends MainPage {
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	By userName=By.xpath("//input[@name='username']");
	By passWord=By.xpath("//input[@name='password']");
	By loginSubmitBtn=By.xpath("//button[@type='submit']");
	By forgotPasswordLink=By.xpath("//div//p[text()='Forgot your password? ']");
	By forgotPageCancelBtn=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/form/div[2]/button[1]");
	
	
	
	
	public void Login(String userName,String passWord)
	{
		try
		{
			driver.findElement(this.userName).clear();
			Thread.sleep(2000);
			driver.findElement(this.userName).sendKeys(userName);	
			Thread.sleep(2000);
			driver.findElement(this.passWord).clear();	
			Thread.sleep(2000);
			driver.findElement(this.passWord).sendKeys(passWord);
			Thread.sleep(2000);
			driver.findElement(loginSubmitBtn).click();
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
	}
	
	public void ForgotPassword()
	{
		try
		{
			driver.findElement(forgotPasswordLink).click();
			Thread.sleep(2000);
			driver.findElement(forgotPageCancelBtn).click();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	

}
