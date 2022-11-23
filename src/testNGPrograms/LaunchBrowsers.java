package testNGPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchBrowsers 
{
  @Test
  public void Launch_chrome()
  {

  	
  		
  		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\First\\Binary\\chromedriver.exe");
  		WebDriver driver=new ChromeDriver();
  		//String facebook="http://www.facebook.com";
  		//driver.get("https://www.google.com/");
  		//driver.get("http://www.utkarshaaacademy.com");
  		//driver.get(facebook);
  	
  }
  	@Test
  	public void Launch_edge()
  	{
  		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\eclipse-workspace\\First\\Binary\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
  			//driver.get("http://testing.org");
  			
  	}
  		@Test
  		
  
  			public void Launch_Firefox() 
  			{
  					System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\eclipse-workspace\\First\\Binary\\geckodriver.exe");
  					WebDriver driver=new FirefoxDriver();


  			}
  				
}
  			


  			

  
	  
  
  		
  	

