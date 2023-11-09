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
	By profilePicBtn=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/div/button/i");
	By firstName=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input");
	By lastName=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input");
	By employeeId=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input");
	By cancelBtn=By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[1]");
	By saveBtn=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]");
	
	public AddEmployeespage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void addProfilePic()
	{
		try
		{
			driver.findElement(moduleLink).click();
			driver.findElement(AddEmployeeButton).click();
			driver.findElement(profilePicBtn).click();
			driver.switchTo()
        		.activeElement()
		        .sendKeys("C:\\Users\\chand\\OneDrive\\Desktop\\img.jpg");	
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
			driver.findElement(moduleLink).click();
			driver.findElement(AddEmployeeButton).click();
			driver.findElement(profilePicBtn).click();
			driver.switchTo()
				.activeElement()
				.sendKeys("C:\\Users\\chand\\OneDrive\\Desktop\\sample-1.tiff");
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
			driver.findElement(AddEmployeeButton).click();
			driver.findElement(firstName).sendKeys("Aara");
			driver.findElement(lastName).sendKeys("amudhan");
			driver.findElement(employeeId).clear();	
			driver.findElement(employeeId).sendKeys("0801");
			driver.findElement(cancelBtn).click();
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
			driver.findElement(moduleLink).click();
			driver.findElement(AddEmployeeButton).click();
			driver.findElement(firstName).sendKeys("Aara");
			driver.findElement(lastName).sendKeys("amudhan");
			driver.findElement(employeeId).clear();	
			driver.findElement(employeeId).sendKeys("0801");
			driver.findElement(saveBtn).click();
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
			driver.findElement(moduleLink).click();
			driver.findElement(AddEmployeeButton).click();
			driver.findElement(firstName).sendKeys("dsfsfsfsfsfsfsfsfsfsfsfsfsfsfsfsf");
			driver.findElement(lastName).sendKeys("dsfsfsfsfsfsfsfsfsfsfsfsfsfsfsfsf");
			driver.findElement(employeeId).clear();
			driver.findElement(employeeId).sendKeys("@801");
			driver.findElement(saveBtn).click();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
