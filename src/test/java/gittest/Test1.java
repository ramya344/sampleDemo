package gittest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
  @Test
  public void lunch() {
	
		  System.setProperty("webdriver.chrome.driver","D:\\amma\\ChromeDriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://myaccount.google.com/");
		  System.out.print("opened successfully");
  }
}
