package org.test1;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junit extends LibGlobal {

	static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		browserlaunch("https://adactinhotelapp.com/");
		maximize();
	}

	// @AfterClass
	// public static void afterClass() {
	// closeWindow();
	// }

	@Test
	public void test() throws IOException, InterruptedException {
		WebElement txtusename = locatorId("username");
		String username = getData("Datas", 1, 0);
		type(txtusename, username);

		WebElement txtpassword = locatorId("password");
		String password = getData("Datas", 1, 1);
		type(txtpassword, password);
		WebElement btnlogin = locatorId("login");
		btnclick(btnlogin);
		WebElement dnDlocation = locatorId("location");
		String location = getData("Datas", 1, 2);
		dnDselect(dnDlocation, location);
		
		WebElement dnDHotel = locatorId("hotels");
		String hotel = getData("Datas", 1, 3);
		dnDselect(dnDHotel, hotel);
		
		WebElement dnDRoomType = locatorId("room_type");
		String roomType = getData("Datas", 1, 4);
		dnDselect(dnDRoomType, roomType);
		
		WebElement dnDnosRoom = locatorId("room_nos");
		String noOfRooms = getData("Datas", 1, 5);
		dnDselect(dnDnosRoom, noOfRooms);
		
		WebElement txtCheckInDate = locatorId("datepick_in");
		String checkInDate = getData("Datas", 1, 6);
		type(txtCheckInDate, checkInDate);
		
		WebElement txtCheckOut = locatorId("datepick_out");
		String checkOut = getData("Datas", 1, 7);
		type(txtCheckOut, checkOut);
		
		WebElement dnDAdultcount = locatorId("adult_room");
		String adultPerRoom = getData("Datas", 1, 8);
		dnDselect(dnDAdultcount, adultPerRoom);
		
		WebElement dnDChildCount = locatorId("child_room");
		String childPerRoom = getData("Datas", 1, 9);
		dnDselect(dnDChildCount, childPerRoom);
		
		WebElement btnSearch = locatorId("Submit");
		btnclick(btnSearch);
		
		WebElement radiobtn = locatorId("radiobutton_0");
		btnclick(radiobtn);
		
		WebElement btnContinue = locatorId("continue");
		btnclick(btnContinue);

		WebElement txtfirstname = locatorId("first_name");
		String firstNam = getData("Datas", 1, 10);
		type(txtfirstname, firstNam);
		
		WebElement txtlastname = locatorId("last_name");
		String lastNam = getData("Datas", 1, 11);
		type(txtlastname, lastNam);
		
		WebElement txtAdd = locatorId("address");
		String billingAdd = getData("Datas", 1, 12);
		type(txtAdd, billingAdd);
		
		WebElement txtCreditNo = locatorId("cc_num");
		String creditNo = getData("Datas", 1, 13);
		type(txtCreditNo, creditNo);
		
		WebElement dnDcreditType = locatorId("cc_type");
		String creditType = getData("Datas", 1, 14);
		dnDselect(dnDcreditType, creditType);
		
		WebElement dnDMonth = locatorId("cc_exp_month");
		String cardMonth = getData("Datas", 1, 15);
		dnDselect(dnDMonth, cardMonth);
		
		WebElement dnDcredityear = locatorId("cc_exp_year");
		String cardYear = getData("Datas", 1, 16);
		dnDselect(dnDcredityear, cardYear);

		WebElement txtCvv = locatorId("cc_cvv");
		String CVV = getData("Datas", 1, 17);
		type(txtCvv, CVV);
		
		WebElement btnBooknow = locatorId("book_now");
		btnclick(btnBooknow);
		Thread.sleep(5000);
		WebElement orderId = locatorId("order_no");
		String attribute = getAttribute(orderId);
		setCellValue("Datas", 1, 18, attribute);

	}

	private void dnDselect(WebElement dnDlocation, String location) {
		// TODO Auto-generated method stub
		
	}

}