package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class EmployeeInformationPage extends MainPage  {
	Actions a = new Actions(driver);
	JavascriptExecutor executor = (JavascriptExecutor) driver;
	private By moduleLink=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a");
	private By empnameSearchBox=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input");
	private By supnameSearchBox=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[5]/div/div[2]/div/div/input");
	private By searchBtn=By.cssSelector("button[type='submit']");
	private By resetBtn=By.cssSelector("button[type='reset']");
	private By addEmployeeBtn=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");
	private By helpBtn=By.cssSelector("button[title='Help']");
    private By includeDropdown=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div/span");
	private By recordListCheckBox=By.cssSelector("div[class='oxd-table-card-cell-checkbox']");
	private By divA=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[4]/div");

public EmployeeInformationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


public void EmpInfoInputs()
{
	try
	{
		driver.findElement(moduleLink).click();
		keyboardActions(driver.findElement(addEmployeeBtn),"Alice");
		keyboardActions(driver.findElement(supnameSearchBox),"Kevin");

	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
}


public void EmpInfoInputsAlert()
{
	try
	{
		driver.findElement(moduleLink).click();
		keyboardActions(driver.findElement(empnameSearchBox),"$#@");
		keyboardActions(driver.findElement(supnameSearchBox),"^&89");
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
}



public void EmpInfoSearch()
{
	try
	{
		driver.findElement(moduleLink).click();
		keyboardActions(driver.findElement(empnameSearchBox),"Alice");
		keyboardActions(driver.findElement(supnameSearchBox),"Kevin");
		driver.findElement(searchBtn).click();	
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
}


public void EmpInfoSearchAlert()
{
	try
	{
		driver.findElement(moduleLink).click();
		keyboardActions(driver.findElement(empnameSearchBox),"Alice");
		keyboardActions(driver.findElement(supnameSearchBox),"Kevin");
		driver.findElement(searchBtn).click();
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
}


public void EmpInfoReset()
{
	try
	{
		driver.findElement(moduleLink).click();
		keyboardActions(driver.findElement(empnameSearchBox),"Alice");
		keyboardActions(driver.findElement(supnameSearchBox),"Kevin");
		driver.findElement(resetBtn).click();
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
}


public void AddEmployess()
{
	try
	{
		driver.findElement(moduleLink).click();
		driver.findElement(addEmployeeBtn).click();
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}

public void Questioning()
{
	try
	{
		driver.findElement(moduleLink).click();
		driver.findElement(helpBtn).click();
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}


public void recordListSelection()
{
	try
	{
		driver.findElement(moduleLink).click();
		List<WebElement> CheckBox=driver.findElements(recordListCheckBox);	
		a.moveToElement(CheckBox.get(1)).click().build().perform();
		a.moveToElement(CheckBox.get(2)).click().build().perform();
		a.moveToElement(CheckBox.get(3)).click().build().perform();	
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
}


public void recordListDelete()
{
	try
	{
		driver.findElement(moduleLink).click();
		List<WebElement> CheckBox=driver.findElements(recordListCheckBox);
		System.out.println("CheckBox.size()"+CheckBox.size() );
		a.moveToElement(CheckBox.get(1)).click().build().perform();
		WebElement subNode = new WebDriverWait(driver,Duration.ofSeconds(10)).until(
		    ExpectedConditions.presenceOfNestedElementLocatedBy(
		    		driver.findElement(divA), By.xpath(".//div[9]/div/button")
		    )
		);		
		subNode.click();
		WebElement recordListDeleteBtn=driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]"));
		recordListDeleteBtn.click();
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
}


public void recordListCancelDeletion()
{
		try
		{
			driver.findElement(moduleLink).click();
			List<WebElement> CheckBox=driver.findElements(recordListCheckBox);
			a.moveToElement(CheckBox.get(1)).click().build().perform();
			WebElement subNode = new WebDriverWait(driver,Duration.ofSeconds(10)).until(
			    ExpectedConditions.presenceOfNestedElementLocatedBy(
			    		driver.findElement(divA), By.xpath(".//div[9]/div/button")
			    )
			);		
			subNode.click();
			WebElement recordListCancelDeleteBtn=driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[1]"));
			recordListCancelDeleteBtn.click();
	
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	
}

public void recordListEdit()
{
	try
	{
		driver.findElement(moduleLink).click();
		List<WebElement> CheckBox=driver.findElements(recordListCheckBox);
		a.moveToElement(CheckBox.get(1)).click().build().perform();
		WebElement subNode = new WebDriverWait(driver,Duration.ofSeconds(10)).until(
			    ExpectedConditions.presenceOfNestedElementLocatedBy(
			    		driver.findElement(divA), By.xpath(".//div[9]/div/button[2]")
			    )
			);	
		subNode.click();	
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
}


	public void keyboardActions(WebElement searchBox,String s)
	{
		try {
			searchBox.clear();
			a.moveToElement(searchBox).perform();
			a.click().perform();
			a.pause(3000);
			a.pause(3000);
			a.sendKeys(s).perform(); 
			a.pause(3000);
			a.keyDown(Keys.DOWN).perform(); 
			a.pause(3000);
			a.keyDown(Keys.ENTER).perform(); 
			Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
