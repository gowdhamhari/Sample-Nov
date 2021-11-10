package org.sample;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.test1.LibGlobal;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Employee extends LibGlobal {
	
	static WebDriver driver;

	@BeforeClass
	public static void beforeclass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void afterclass() {
		driver.quit();

	}

	@Before
	public void befor() {
		Date data = new Date();
		System.out.println(data);

	}

	@After
	public void after() {
		Date data = new Date();
		System.out.println(data);

	}

	@Test
	public void Login() {
		String currentUrl = driver.getCurrentUrl();
		boolean b = currentUrl.contains("adactinhotelapp");
		Assert.assertTrue("veriurl", b);

		WebElement txtuserName = driver.findElement(By.id("username"));
		txtuserName.sendKeys("gowdham");
		String name = txtuserName.getAttribute("value");
		Assert.assertEquals("verify userName", "gowdham", name);

		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys("hello");

		String attribute = txtpassword.getAttribute("value");
		Assert.assertEquals("verifypassword", "hello", attribute);

		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		
	
	
	}
}