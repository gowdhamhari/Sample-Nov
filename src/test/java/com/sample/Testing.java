package com.sample;

import org.openqa.selenium.WebElement;

public class Testing extends Baseclass {
	public static void main(String[] args) {
		browserLaunch("https://adactinhotelapp.com/");
		POM p = new POM();
		WebElement username = p.getUsername();
		username.sendKeys("gowdhamhari");
		WebElement password = p.getPassword();
		password.sendKeys("18051602");
		WebElement btnLogin = p.getLogin();
		btnLogin.click();
	}

}