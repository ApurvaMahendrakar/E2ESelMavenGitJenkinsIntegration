package MavenGitJenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_002 {
	
	@Test
	public void testCase2() {
		
	
		System.setProperty("webdriver.chrome.driver", "C://browserdrivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("google.com");
		/*driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input.button")).click();
		driver.quit();
		
		*/

}
}