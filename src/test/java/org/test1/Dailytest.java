package org.test1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Dailytest {

	private static WebElement dDnSelect;

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		File file = new File("C:\\Users\\pc\\eclipse-workspace\\Maven\\Book\\Skills.xlsx");
		Workbook Workbook = new XSSFWorkbook();
		Sheet sheet = Workbook.createSheet("Sheet1");
		WebElement dDnSelect = driver.findElement(By.id("Skills"));
		Select Select = new Select(dDnSelect);
		List<WebElement> options = Select.getOptions();
		
		for (int i = 0; i < options.size(); i++) {
			WebElement Element = options.get(i);
			Row row = sheet.createRow(i);
			Cell cell = row.createCell(0);
			
			cell.setCellValue(Element.getText());
		}
		FileOutputStream OutputStream = new FileOutputStream(file);
		
		Workbook.write(OutputStream);
		System.out.println("Done");
		driver.quit();
		
	}
}


