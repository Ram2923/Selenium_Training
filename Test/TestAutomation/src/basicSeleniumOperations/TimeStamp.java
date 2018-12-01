package basicSeleniumOperations;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeStamp {

	public static void main(String[] args) 
	{
		SimpleDateFormat date = new SimpleDateFormat("yyyy:dd:MM:hh:mm:ss");
		String ret = date.format(new Date());
		System.out.println(ret);
		

	}

}
