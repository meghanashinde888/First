import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\First\\Binary\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://www.facebook.com");
  }
}
