package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg {
	WebDriver driver;

	@BeforeClass
	private void browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
	}

	@Parameters({ "username", "password" })
	@Test
	private void login(String user, String pass) {

		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys(user);
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys(pass);
	}

}
