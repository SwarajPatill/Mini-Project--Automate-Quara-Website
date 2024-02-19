package miniproject;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class QuaraSearch {
	public static WebDriver driver;
	
	public static void OpenBrowser() {
		driver = DriverSetup.getWebDriver();
		screenshots.takescreenshot(driver, "browser.png");
		}

	public static void testing(String[] data) {
		driver.findElement(By.tagName("input")).sendKeys(data[0]);
		driver.findElement(By.xpath("//*[@id=\'selector-option-0\']//span//span")).click();

		screenshots.takescreenshot(driver, "Input1.png");
	}
	
	public static void validate() {
		String actualText = "Results for testing";
		String getText = driver.findElement(By.xpath("//*[@id=\'mainContent\']/div/div/div[1]/div/div[1]/div")).getText();
		System.out.println("Result :- ");
		
		if(actualText.equals(getText))
		{
			System.out.println("Validation succesfull - Text Match");
		}
		else
		{
			System.out.println("Validation unsuccesfull - Text Not Match");
		}
	}
	public static void Signin() {
		
		//.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div[1]/div[2]/div/div[2]/div/button/div/div/div")).click();
		driver.findElement(By.xpath("//div[text()=\"Sign In\"]")).click();
		screenshots.takescreenshot(driver, "Signin.png");
	
	}
	
	public static void SignUp() {
		//driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div[2]/div/div/div[2]/div/span/span[4]")).click();
		driver.findElement(By.xpath("//div[text() ='Sign up with email' ]")).click();
	}
	
	public static void SignUpButton() {
		WebElement button = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[2]/div/div/button"));
		if(!button.isEnabled())
		{
			System.out.println("SignUpButton is disabled");
		}
		else
		{
			System.out.println("SignUpButton is enabled");
		}
	}
	
	public static  void InvalidEmail(String []data) {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(data[1]);
		
		WebElement Errormsg = driver.findElement(By.xpath("//div[text()= 'The email address you entered is not valid.']"));
		System.out.println(Errormsg.getText());
		screenshots.takescreenshot(driver, "Error.png");

	}

	public static void CloseBrowser() {
		driver.quit();
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		QuaraSearch qs = new QuaraSearch();
		String []data1 = miniprojectexcel.readDataFromFile();
		//String []deta1 = miniprojectexcel.WriteDataFromFile();
		
		try {
		  OpenBrowser();
		  testing(data1);
		  validate();
		  Signin();
		  SignUp();
		  SignUpButton();
		  InvalidEmail(data1);
		  CloseBrowser();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
 
	}
 
}
