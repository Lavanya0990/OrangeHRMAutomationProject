package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddEmployeespage extends MainPage {
	By moduleLink=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a");
	By AddEmployeeButton=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");
	public AddEmployeespage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void addProfilePic()
	{
		
		try
		{
			System.out.println("addProfilePic");
		driver.findElement(moduleLink).click();
		Thread.sleep(2000);
		driver.findElement(AddEmployeeButton).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/div/button")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/div/div/img")).sendKeys("C:\\Users\\chand\\OneDrive\\Desktop\\img.jpg");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/div/button/i")).click();
	    driver.switchTo()
	            .activeElement()
	            .sendKeys(
	                    "C:\\Users\\chand\\OneDrive\\Desktop\\img.jpg");
	    
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	public void addProfilePicAlert()
	{
		
		try
		{
			System.out.println("addProfilePic");
		driver.findElement(moduleLink).click();
		Thread.sleep(2000);
		driver.findElement(AddEmployeeButton).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/div/button/i")).click();
		driver.switchTo()
        .activeElement()
        .sendKeys(
	                    "C:\\Users\\chand\\OneDrive\\Desktop\\sample-1.tiff");
	    

		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void addProfileCancel()
	{
		try
		{
			
		driver.findElement(moduleLink).click();
		Thread.sleep(2000);
		driver.findElement(AddEmployeeButton).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input")).sendKeys("Aara");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input")).sendKeys("amudhan");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).sendKeys("0801");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[1]")).click();
		Thread.sleep(2000);
	    

		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void addProfileSave()
	{
		try
		{
			System.out.println("addProfilePic");
		driver.findElement(moduleLink).click();
		Thread.sleep(2000);
		driver.findElement(AddEmployeeButton).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input")).sendKeys("Aara");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input")).sendKeys("amudhan");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).sendKeys("0801");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
		Thread.sleep(2000);
	    

		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void addProfileSaveAlert()
	{
		try
		{
			System.out.println("addProfilePic");
		driver.findElement(moduleLink).click();
		Thread.sleep(2000);
		driver.findElement(AddEmployeeButton).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input")).sendKeys("dsfsfsfsfsfsfsfsfsfsfsfsfsfsfsfsf");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input")).sendKeys("dsfsfsfsfsfsfsfsfsfsfsfsfsfsfsfsf");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).sendKeys("@801");
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
		Thread.sleep(2000);
	    
		

		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
