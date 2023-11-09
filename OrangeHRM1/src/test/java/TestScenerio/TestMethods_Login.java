package TestScenerio;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.AddEmployeespage;
import Pages.EmployeeInformationPage;
import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethods_Login {
   
	public WebDriver driver;
	LoginPage loginPage;
	EmployeeInformationPage employeeInfoPage;
	AddEmployeespage addEmployeesPage;
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("TestMethods_Login beforeTest");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
		loginPage=new LoginPage(driver);
		employeeInfoPage=new EmployeeInformationPage(driver); 
		addEmployeesPage=new AddEmployeespage(driver);
		System.out.println("TestMethods_Login beforeTest 333");
		
	}
	
	
	
	@Test(priority=1)
	public void verifyLogin_TC1()
	{
		System.out.println("verifyLogin_TC1");
		loginPage.Login("Agent", "admin123");
	}
	
	@Test(priority=2)
	public void verifyLogin_TC2()
	{
		System.out.println("verifyLogin_TC2");
		loginPage.Login("Admin", "admin");
	}
	
	@Test(priority=3)
	public void verifyLogin_TC3()
	{
		System.out.println("verifyLogin_TC3");
		loginPage.Login("Agent", "admin");
	}
	
	@Test(priority=4)
	public void verifyLogin_TC4()
	{
		System.out.println("verifyLogin_TC4");
		loginPage.Login("", "");
	}
	
	@Test(priority=5)
	public void verifyLogin_TC5()
	{
		System.out.println("verifyLogin_TC5");
		loginPage.ForgotPassword();
	}
	
	@Test(priority=6)
	public void verifyLogin_TC6()
	{
		System.out.println("verifyLogin_TC6");
		loginPage.Login("Admin", "admin123");
	}
	

	
	@Test(priority=8)
	public void verifyEmployeeInfo_TC8()
	{
		System.out.println("verifyEmployeeInfo_TC8");
		employeeInfoPage.EmpInfoInputs();
			
	}
	
	@Test(priority=9)
	public void verifyEmployeeInfo_TC9()
	{
		System.out.println("verifyEmployeeInfo_TC9");		
		employeeInfoPage.EmpInfoInputsAlert();
		
	}
	
	@Test(priority=10)
	public void verifyEmployeeInfo_TC10()
	{
		System.out.println("verifyEmployeeInfo_TC10");
		employeeInfoPage.EmpInfoSearch();
		
	}
	
	@Test(priority=11)
	public void verifyEmployeeInfo_TC11()
	{
		System.out.println("verifyEmployeeInfo_TC11");
		employeeInfoPage.EmpInfoSearchAlert();
		
	}
	
	@Test(priority=12)
	public void verifyEmployeeInfo_TC12()
	{
		System.out.println("verifyEmployeeInfo_TC12");
		employeeInfoPage.EmpInfoReset();
		
	}
	
	@Test(priority=13)
	public void verifyEmployeeInfo_TC13()
	{
		System.out.println("verifyEmployeeInfo_TC13");
		employeeInfoPage.AddEmployess();
		
	}
	
	
	@Test(priority=14)
	public void verifyEmployeeInfo_TC14()
	{
		System.out.println("verifyEmployeeInfo_TC14");
		employeeInfoPage.Questioning();
		
	}
	
	@Test(priority=15)
	public void verifyEmployeeInfo_TC15()
	{
		System.out.println("verifyEmployeeInfo_TC15");
		employeeInfoPage.recordListSelection();
		
	}
	
	@Test(priority=16)
	public void verifyEmployeeInfo_TC16()
	{
		System.out.println("verifyEmployeeInfo_TC16");
		employeeInfoPage.recordListDelete();
		
	}
	
	@Test(priority=17)
	public void verifyEmployeeInfo_TC17()
	{
		System.out.println("verifyEmployeeInfo_TC17");
		employeeInfoPage.recordListCancelDeletion();
		
	}
	
	
	@Test(priority=18)
	public void verifyEmployeeInfo_TC18()
	{
		System.out.println("verifyEmployeeInfo_TC18");
		employeeInfoPage.recordListEdit();
		
	}
	

	
	@Test(priority=21)
	public void AddEmployeeInfo_TC21()
	{
		System.out.println("AddEmployeeInfo_TC21");
		addEmployeesPage.addProfilePic();
		
	}
	
	
	@Test(priority=22)
	public void AddEmployeeInfo_TC22()
	{
		System.out.println("AddEmployeeInfo_TC22");
		addEmployeesPage.addProfilePicAlert();
		
	}
	
	
	@Test(priority=23)
	public void AddEmployeeInfo_TC23()
	{
		System.out.println("AddEmployeeInfo_TC23");
		addEmployeesPage.addProfileCancel();
		
	}
	
	@Test(priority=24)
	public void AddEmployeeInfo_TC24()
	{
		System.out.println("AddEmployeeInfo_TC24");
		addEmployeesPage.addProfileSave();
		
	}
	
	@Test(priority=25)
	public void AddEmployeeInfo_TC25()
	{
		System.out.println("AddEmployeeInfo_TC25");
		addEmployeesPage.addProfileSaveAlert();
		
	}
	
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("afterTest");
		driver.close();
	}
	
	
}
