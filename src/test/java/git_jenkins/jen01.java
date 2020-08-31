package git_jenkins;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jen01 {
	
	@Test
	public void get01() {
		
        System.setProperty("webdriver.chrome.driver","D:/IT/TechProEd/SeleniumServer/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
		
	}
}
