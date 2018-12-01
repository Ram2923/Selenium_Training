package basicSeleniumOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		FileInputStream fis = new FileInputStream ("C:\\Users\\ADMIN\\Desktop\\Tiger.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		 
	}

}
