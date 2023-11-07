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
	Actions a;
	WebElement searchBox,selectDropDown,recordListCheckbox;
	Select dropdown;
	JavascriptExecutor executor = (JavascriptExecutor) driver;
public EmployeeInformationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


By moduleLink=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a");




public void EmpInfoInputs()
{
	try
	{
		driver.findElement(moduleLink).click();
		Thread.sleep(2000);
		a = new Actions(driver);
		searchBox = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input"));
		keyboardActions(searchBox,"Alice");
		searchBox = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[5]/div/div[2]/div/div/input"));
		keyboardActions(searchBox,"Kevin");
		 
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i")).click();
		Thread.sleep(2000);
		//List<WebElement> options= driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div"));
//		li[text()='oxd-select-dropdown.--position-bottom']
//		*[@id="app"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div[5]
//		*[@id="app"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div
		//span[text()='Freelance']
//		System.out.println(options.size());
//		for(int i=2;i<=options.size();i++)
//		{
//		  //System.out.println(element.getText());
//			if(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div["+i+"]/span")).getText().equals("Freelance"))
//			{
//				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div["+i+"]/span")).click();
//			}
			
//			if(element.getText().equals("Freelance"));
//			{
//				element.click();
//			}
		//}
		
		driver.findElement(By.xpath("//span[text()='Freelance']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[2]/i")).click();
		driver.findElement(By.xpath("//span[text()='Current and Past Employees']")).click();
		Thread.sleep(2000);
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
		Thread.sleep(2000);
		a = new Actions(driver);
		searchBox = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input"));
		keyboardActions(searchBox,"$#@");
		searchBox = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[5]/div/div[2]/div/div/input"));
		keyboardActions(searchBox,"^&89");
		 
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys("$%%$6");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i")).click();
		Thread.sleep(5000);
		
		
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
		Thread.sleep(2000);
		a = new Actions(driver);
		searchBox = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input"));
		keyboardActions(searchBox,"Alice");
		searchBox = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[5]/div/div[2]/div/div/input"));
		keyboardActions(searchBox,"Kevin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[2]/i")).click();
		driver.findElement(By.xpath("//span[text()='Current and Past Employees']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
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
		Thread.sleep(2000);
		a = new Actions(driver);
		searchBox = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input"));
		keyboardActions(searchBox,"Lavanya");
		searchBox = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[5]/div/div[2]/div/div/input"));
		keyboardActions(searchBox,"");
		 
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Freelance']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[2]/i")).click();
		driver.findElement(By.xpath("//span[text()='Current and Past Employees']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		Thread.sleep(2000);
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
		Thread.sleep(2000);
		a = new Actions(driver);
		searchBox = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input"));
		keyboardActions(searchBox,"Alice");
		searchBox = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[5]/div/div[2]/div/div/input"));
		keyboardActions(searchBox,"Kevin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[2]/i")).click();
		driver.findElement(By.xpath("//span[text()='Current and Past Employees']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button[type='reset']")).click();
		Thread.sleep(2000);
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
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
		Thread.sleep(2000);
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
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[title='Help']")).click();
		Thread.sleep(2000);
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
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Full-Time Permanent']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();	
		Thread.sleep(2000);
		
		recordListCheckbox =driver.findElement(By.cssSelector("input[value='1']"));
		a = new Actions(driver);
		a.moveToElement(recordListCheckbox).click().build().perform();
		Thread.sleep(2000);
		
		
		recordListCheckbox=driver.findElement(By.cssSelector("input[value='2']"));
		a.moveToElement(recordListCheckbox).click().build().perform();
		Thread.sleep(2000);
		
		recordListCheckbox=driver.findElement(By.cssSelector("input[value='3']"));
		a.moveToElement(recordListCheckbox).click().build().perform();
		Thread.sleep(2000);
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
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i")).click();
		Thread.sleep(2000);		
		recordListCheckbox =driver.findElement(By.cssSelector("input[value='0']"));
		a = new Actions(driver);
		a.moveToElement(recordListCheckbox).click().build().perform();
		Thread.sleep(2000);
		
		WebElement divA=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[4]/div"));
		WebElement subNode = new WebDriverWait(driver,Duration.ofSeconds(10)).until(
			    ExpectedConditions.presenceOfNestedElementLocatedBy(
			        divA, By.xpath(".//div[9]/div/button")
			    )
			);
		
		subNode.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
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
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i")).click();
		Thread.sleep(2000);		
		recordListCheckbox =driver.findElement(By.cssSelector("input[value='0']"));
		a = new Actions(driver);
		a.moveToElement(recordListCheckbox).click().build().perform();
		Thread.sleep(2000);
		
		WebElement divA=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[4]/div"));
		WebElement subNode = new WebDriverWait(driver,Duration.ofSeconds(10)).until(
			    ExpectedConditions.presenceOfNestedElementLocatedBy(
			        divA, By.xpath(".//div[9]/div/button")
			    )
			);
		
		subNode.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[1]")).click();
		Thread.sleep(2000);
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
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i")).click();
		Thread.sleep(2000);		
		recordListCheckbox =driver.findElement(By.cssSelector("input[value='0']"));
		a = new Actions(driver);
		a.moveToElement(recordListCheckbox).click().build().perform();
		Thread.sleep(2000);
		
		WebElement divA=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[4]/div"));
		WebElement subNode = new WebDriverWait(driver,Duration.ofSeconds(10)).until(
			    ExpectedConditions.presenceOfNestedElementLocatedBy(
			        divA, By.xpath(".//div[9]/div/button[2]")
			    )
			);
		
		subNode.click();
		Thread.sleep(2000);
		
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
}

public void recordListSorting()
{
	try
	{
		driver.findElement(moduleLink).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[2]/div/i")).click();
		Thread.sleep(2000);
		
//		WebElement scrollArea = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[3]/div/div"));
//		scroll_Page(scrollArea ,100);
		
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[2]/div/div"));
				//(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[3]/div/div/ul/li[1]"));
		
		executor.executeScript("arguments[0].scrollIntoView(true);", ele);    
		
		
		a=new Actions(driver);
		a.moveToElement(ele).click().build().perform();
		Thread.sleep(2000);
		
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}


public void recordListPageNumbering()
{
	try
	{
		driver.findElement(moduleLink).click();
		Thread.sleep(2000);
		
		executor.executeScript("window.scrollBy(0,250)");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[4]/nav/ul/li[2]/button")).click();
		Thread.sleep(2000);
		

		
		executor.executeScript("window.scrollBy(0,250)");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[4]/nav/ul/li[1]/button")).click();
		Thread.sleep(2000);
		
		executor.executeScript("window.scrollBy(0,250)");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[4]/nav/ul/li[3]/button")).click();
		Thread.sleep(2000);
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
}


public boolean scroll_Page(WebElement webelement, int scrollPoints)
{
    try
    {               
        Actions dragger = new Actions(driver);
        // drag downwards
        int numberOfPixelsToDragTheScrollbarDown = 10;
        for (int i = 10; i < scrollPoints; i = i + numberOfPixelsToDragTheScrollbarDown)
        {
            dragger.moveToElement(webelement).clickAndHold().moveByOffset(0, numberOfPixelsToDragTheScrollbarDown).release(webelement).build().perform();
        }
        Thread.sleep(500);
        return true;
    }
    catch (Exception e)
    {
        e.printStackTrace();
        return false;
    }
}

public void keyboardActions(WebElement searchBox,String s)
{
	try {
a.moveToElement(searchBox).perform();
a.click().perform();
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
