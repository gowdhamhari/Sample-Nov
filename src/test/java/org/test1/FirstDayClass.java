package org.test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FirstDayClass {

	private static DateFormat dateFormat;

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\pc\\eclipse-workspace\\Maven\\Book\\Book.xlsx");
		FileInputStream Stream = new FileInputStream(file);
		
		Workbook Workbook = new XSSFWorkbook(Stream);
		Sheet sheet = Workbook.getSheet("Sheet1");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				//type1--->text, 0--->Number,date
				int type = cell.getCellType();
				if (type==1) {
					String data = cell.getStringCellValue();
					System.out.println(data);
				}
				if (type==0) {
					if (DateUtil.isCellInternalDateFormatted(cell)) {
						Date date = cell.getDateCellValue();
						SimpleDateFormat dataFormat = new SimpleDateFormat("dd-MMM-YYYY");
						String data = dataFormat.format(date);
						System.out.println(data);
					}
					if (type==0) {

					double d = cell.getNumericCellValue();
					long l = (long) d;
					String valueOf = String.valueOf(l);
					System.out.println(valueOf);
						if (DateUtil.isCellInternalDateFormatted(cell)) {
							Date date = cell.getDateCellValue();
							SimpleDateFormat dataFormat = new SimpleDateFormat("dd-MMM-YYYY");
							String data = dataFormat.format(date);
							System.out.println(data);
						}
					}
				}
			}
		}}}
