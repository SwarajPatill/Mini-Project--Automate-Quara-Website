package miniproject;
import java.io.File;
import java.io.IOException;
 
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
 
public class screenshots {
	
	public static void takescreenshot(WebDriver driver,String fileName) {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);      // capture 
		File trg = new File(".\\screenshots\\" + fileName);  // store
		
		try {
			FileUtils.copyFile(src, trg);
		}
		catch(IOException e) {
			System.out.println("could not take screenshot");
		}
	}
 
}