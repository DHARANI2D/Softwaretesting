package com.day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task51 {
  //
  @Test
  public void Test() {
	    WebDriverManager.chromedriver().setup();
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origin=*");
		WebDriver driver;
      driver=new ChromeDriver(co);
	  String ur="https://www.godaddy.com/";
	  driver.get(ur);
	  driver.manage().window().maximize();
	  String title=driver.getTitle();
      String expectedtitle="Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
      Assert.assertEquals(title, expectedtitle);
      String url=driver.getCurrentUrl();
      String expec_url="https://www.godaddy.com/en-in";
      Assert.assertEquals(url, expec_url);
	 
 }
}