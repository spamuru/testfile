package testfile.testfile;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class TestDateFormate {

	public static void main(String[] args) throws ParseException {
	/*	// TODO Auto-generated method stub
       //String date = "2005-02-15 T12:00:00Z";
       SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
       String date = "2005-02-15T12:00:00Z";
       System.out.println(df.parse(date));*/
	String date ="2020-02-14 00:00:00.0";
	 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	 System.out.println(df.parse(date).toString());
	 String input = df.parse(date).toString();
	 DateTimeFormatter f = DateTimeFormatter.ofPattern( "E MMM dd HH:mm:ss z uuuu" )
	                                        .withLocale( Locale.US );
	 ZonedDateTime zdt = ZonedDateTime.parse( input , f );
	 System.out.println( "zdt: " + zdt );
	}

}
