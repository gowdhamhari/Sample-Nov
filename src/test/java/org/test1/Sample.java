package org.test1;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Sample {
	
	public static void main(String[] args) throws IOException {
		LibGlobal global = new LibGlobal();
		global.browserlaunch("https://adactinhotelapp.com/");
		global.maximize();

		String user = global.getData("Datas", 1, 0);
		String pass = global.getData("Datas", 1, 1);
		String loctn = global.getData("Datas", 1, 2);
		String hotel = global.getData("Datas", 1, 3);
		String rooms = global.getData("Datas", 1, 4);
		String numberofrooms = global.getData("Datas", 1, 5);
		String checkindate = global.getData("Datas", 1, 6);
		String checkoutdate	 = global.getData("Datas", 1, 7);
		String perRoom = global.getData("Datas", 1, 8);
		String Childrenroom = global.getData("Datas", 1, 9);
		String firstName = global.getData("Datas", 1,10);
		String lastName = global.getData("Datas", 1,11);
		String Address = global.getData("Datas", 1,12);
		String Creditno = global.getData("Datas", 1,13);
		String Creditcardtype = global.getData("Datas", 1,14);
		String Expmonth = global.getData("Datas", 1,15);
		String Expyr = global.getData("Datas", 1,16);
		String CVV = global.getData("Datas", 1,17);

		WebElement txtusername = global.findByid("username");
		global.type(txtusername, user);
		WebElement txtpassword = global.findByid("password");
		global.type(txtpassword, pass);
		WebElement btnLogin = global.findByid("login");
		global.btnclick(btnLogin);
		WebElement dDnlocation = global.findByid("location");
		global.selectByVisibleText(dDnlocation, loctn);
		WebElement hotels = global.findByid("hotels");
		global.selectByVisibleText(hotels, hotel);
		WebElement roomtype = global.findByid("room_type");
		global.type(roomtype, rooms);
		WebElement numberofroom = global.findByid("room_nos");
		global.type(numberofroom, numberofrooms);
		WebElement txtcheckIndate = global.findByid("datepick_in");
		global.type(txtcheckIndate, checkindate);
		WebElement txtcheckout = global.findByid("datepick_out");
		global.type(txtcheckout, checkoutdate);
		WebElement dDnAdultperroom = global.findByid("adult_room");
		global.type(dDnAdultperroom, perRoom);
		WebElement dDnChildrenroom = global.findByid("child_room");
		global.type(dDnChildrenroom, Childrenroom);
		WebElement btnsearch = global.findByid("Submit");
		global.btnclick(btnsearch);
		WebElement Select = global.findByid("radiobutton_0");
		global.btnclick(Select);
		WebElement btnContinue = global.findByid("continue");
		global.btnclick(btnContinue);
		WebElement txtfirstName = global.findByid("first_name");
		global.type(txtfirstName, firstName);
		WebElement txtlastName = global.findByid("last_name");
		global.type(txtlastName, lastName);
		WebElement txtAdress = global.findByid("address");
		global.type(txtAdress, Address);
		WebElement txtcreditno = global.findByid("cc_num");
		global.type(txtcreditno, Creditno);
		WebElement dDncreditcard = global.findByid("cc_type");
		global.selectByVisibleText(dDncreditcard, Creditcardtype);
		WebElement dDnselectmonth = global.findByid("cc_exp_month");
		global.type(dDnselectmonth, Expmonth);
		WebElement month = global.findByid("cc_exp_year");
		global.type(month, Expmonth);
		WebElement year = global.findByid("cc_exp_year");
		global.type(year, Expyr);
		WebElement dDncvv = global.findByid("cc_cvv");
		global.type(dDncvv, CVV);
		WebElement btnbookNow = global.findByid("book_now");
		global.btnclick(btnbookNow);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
