package org.test1;

import java.util.concurrent.Executor;

import org.apache.xmlbeans.impl.soap.Text;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MethodClass {
	
	private void lauchbrowser(WebDriver driver) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	private void firefox(WebDriver driver) {
		 driver = new FirefoxDriver();
	}
	public void enterUrl(WebDriver driver,String Url) {
		driver.get(Url);
	}
	public void Url(WebDriver driver,String Url) {
		String currentUrl = driver.getCurrentUrl();
	}
	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	public void getTitle(WebDriver driver) {
		driver.getTitle();
	}
	public void closewindow(WebDriver driver) {
		driver.close();
	}
	public void closeAllwindow(WebDriver driver) {
		driver.quit();
	}
	public void sendkey(WebElement element,String data) {
		element.sendKeys(data);
	}
	public void click(WebElement element) {
		element.click();
	}
	public void particularUrl(WebDriver driver,String data) {
		driver.navigate().to(data);
	}
	public void navigationback(WebDriver driver,String data) {
		driver.navigate().back();
	}
	public void navigationforward(WebDriver driver,String data) {
		driver.navigate().forward();
	}
	public void navigationrefresh(WebDriver driver,String data) {
		driver.navigate().refresh();
	}
	public void getText(WebElement element) {
		element.getText();
	}
	public void actions(WebDriver driver,WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}
	public void DragDrop(WebDriver driver,WebElement element) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(element,element).perform();
	}
	public void Rightclick(WebDriver driver,WebElement element) {
	    Actions actions = new Actions(driver);
	    actions.contextClick(element).perform();
	}
	public void Click(WebElement element) {
		element.click();
	}
	public void HandlesimpleAlertAccept(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	public void HandlesimpleAlertDismiss(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	public void keydownkeyup(WebDriver driver,CharSequence element) {
		Actions actions = new Actions(driver);
		actions.keyDown(element).keyUp(element);
	}
	public void typeJs(WebDriver driver,WebElement element,String name) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setattribute('value,'"+name+"')", element);
	}
	public void scrolldown(WebDriver driver,WebElement element,String name) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeAsyncScript("arguments[0].scrollIntoview(true)", element);
	}
	public void scrollup(WebDriver driver,WebElement element) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeAsyncScript("argument[0].scrollIntoview(true)", element);
	}
	public void selectoptionByText(WebElement element ,String data) {
		Select Select = new Select(element);
		Select.selectByVisibleText(data);
	}
	public void selectoptionvalue(WebElement element,String value) {
		Select Select = new Select(element);
		Select.selectByValue(value);
	}
	public void selectoptionIndex(WebElement element ,String data) {
		Select select = new Select(element);
		select.selectByIndex(0);
	}
	public void deselectText(WebElement element ,String data) {
		Select select = new Select(element);
		select.selectByIndex(0);
	}
	public void deselectvalue(WebElement element,String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}
	public void deselectIndex(WebElement element,String Index) {
		Select select = new Select(element);
		select.deselectByIndex(0);
	}
	public void deselectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}
	public void switchframeByIndex(WebDriver driver,String Index) {
		driver.switchTo().frame(Index);
	}
	public void switchframeid(WebDriver driver,String data) {
		driver.switchTo().frame(0);
	}
	private void Doubleclick(WebElement element,WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.doubleClick();
	}
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
		
		
		
		
	
		
	
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	
		

	}
	
		
	
		
	
		
	
	}
	
	
		

	}

}
