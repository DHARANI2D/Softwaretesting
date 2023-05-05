package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D7E5 {
  @Test
  
  public void Task1()
  {
	  WebDriverManager.chromedriver().setup();
	  EdgeOptions co= new EdgeOptions();
	  co.addArguments("--remote-allow-origins=*");
	  EdgeDriver driver = new EdgeDriver(co);
	  driver.get("https://www.godaddy.com/en-in");
	  driver.manage().window().maximize();
	  String title = driver.getTitle();
	  String url = driver.getTitle();
	  Assert.assertEquals(url,"https://www.godaddy.com/en-in");
	  Assert.assertEquals(title,"Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN");
	  driver.close();
  }
  @Test(groups= {"Regression"})
  public void Test2()
  {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver;
	  ChromeOptions co = new ChromeOptions();
	  co.addArguments("--remote-allow-origins");
	  driver= new ChromeDriver(co);
	  driver.get("https://WWW.godaddy.com/en-in");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//*@id=\"id-631b049a-e9c0-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
	  driver.findElement(By.linkText("Domain Name Search")).click();
	  
	  
	  
	  
  }
}
