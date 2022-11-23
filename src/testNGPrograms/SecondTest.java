package testNGPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SecondTest {
  @Test

	  public void Launch_chrome()
	  {

	  	
	  		
	  		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\First\\Binary\\chromedriver.exe");
	  		WebDriver driver=new ChromeDriver();
	  		//String facebook="http://www.facebook.com";
	  		//driver.get("https://www.google.com/");
	  		driver.get("http://www.utkarshaaacademy.com");
	  		//driver.get(facebook);
	  	
  }
}

