package Pages;

import org.openqa.selenium.WebDriver;

public class MainPage {
	WebDriver driver;
	
	
	public MainPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public WebDriver getDriver()
	{
		return driver;
	}
}
