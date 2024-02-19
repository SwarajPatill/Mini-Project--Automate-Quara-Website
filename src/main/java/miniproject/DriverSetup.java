package miniproject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
 
import org.openqa.selenium.By;
 
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.*;
import java.util.Scanner;
public class DriverSetup
{ 
    public static WebDriver driver;
    public static String Browser;
    public static WebDriver getWebDriver(){
    	System.out.println("Enter the Browser :- ");
    	Scanner sc = new Scanner(System.in);
		Browser = sc.nextLine();
		if(Browser.equalsIgnoreCase("Chrome")){
			
    	 driver = new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("Edge")){
			driver = new EdgeDriver();
		}
		else {
			System.out.println("Invalid Browser");
		}
		
		driver.get("https://www.quora.com/profile/Quora");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
}
